package catchtheball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// ===== Custom Exception =====
class BallSpeedTooHighException extends Exception {

    public BallSpeedTooHighException(String message) {
        super(message);
    }
}

// ===== Superclass =====
abstract class Ball {

    protected int x, y, size, speed;
    protected Color color;

    public Ball(int x, int y, int size, int speed, Color color) throws BallSpeedTooHighException {
        if (speed > 15) {
            throw new BallSpeedTooHighException("Ball speed too high!");
        }
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
        this.color = color;
    }

    public abstract void move();

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}

// ===== Subclass =====
class NormalBall extends Ball {

    public NormalBall(int x, int y, int size, int speed, Color color) throws BallSpeedTooHighException {
        super(x, y, size, speed, color);
    }

    @Override
    public void move() {
        y += speed;
    }
}

// ===== Paddle Class =====
class Paddle {

    int x, y, width, height, speed;

    public Paddle(int x, int y, int width, int height, int speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void moveLeft() {
        x -= speed;
        if (x < 0) {
            x = 0;
        }
    }

    public void moveRight() {
        x += speed;
        if (x + width > 400) {
            x = 400 - width; // keep inside screen
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
}

// ===== Game Panel =====
class GamePanel extends JPanel implements Runnable {

    private Ball ball;
    private Paddle paddle;
    private boolean running = true;
    private int score = 0;

    public GamePanel() {
        setPreferredSize(new Dimension(400, 500));
        setBackground(Color.WHITE);

        try {
            ball = new NormalBall(200, 0, 20, 5, Color.RED);
        } catch (BallSpeedTooHighException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.exit(0);
        }

        paddle = new Paddle(160, 450, 80, 10, 15);

        // Keyboard control
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    paddle.moveLeft();
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    paddle.moveRight();
                }
            }
        });

        new Thread(this).start(); // Start game loop
    }

    @Override

    public void run() {
        while (running) {
            ball.move();
            checkCollision();
            repaint();

            // Check if missed → end game once
            if (ball.y > getHeight()) {
                running = false;
                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(this, "Game Over! Final Score: " + score);
                    System.exit(0);
                });
                break; // stop the loop immediately
            }

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
            }
        }
    }

    private void checkCollision() {
        if (ball.y + ball.size >= paddle.y
                && ball.x + ball.size >= paddle.x
                && ball.x <= paddle.x + paddle.width) {
            score++;
            ball.y = 0;
            ball.x = (int) (Math.random() * (getWidth() - ball.size));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.draw(g);
        paddle.draw(g);

        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);
    }
}

// ===== Main Game Frame =====
public class CatchTheBall {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Catch the Ball Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GamePanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
