//numaaaa
package abcsequencer;

// Do not modify this file.
public class ABCSequencer {

    public static void main(String[] args) {
        Sequencer seq = new Sequencer(10); // <-- you must implement Sequencer

        Thread a = new Thread(new LetterPrinter('A', seq));
        Thread b = new Thread(new LetterPrinter('B', seq));
        Thread c = new Thread(new LetterPrinter('C', seq));

        a.start();
        b.start();
        c.start();
    }
}

// Do not modify this file.
class LetterPrinter implements Runnable {

    private final char ch;
    private final Sequencer seq;

    public LetterPrinter(char ch, Sequencer seq) {
        this.ch = ch;
        this.seq = seq;
    }

    @Override
    public void run() {
        while (seq.printIfMyTurn(ch)) {

        }
    }
}

class Sequencer {

    int time;
    private char next = 'A';
    private int Printcount = 0;

    public Sequencer(int time) {
        this.time = time;
    }

    public synchronized boolean printIfMyTurn(char ch) {
        if (time * 3 <= Printcount) {
            return false;
        }

        while (ch != next && Printcount < time * 3) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        if (Printcount >= time * 3) {
            return false;
        }


        System.out.print(ch);
        Printcount++;

        if (ch == 'A') {
            next = 'B';
        } else if (ch == 'B') {
            next = 'C';
        } else {
            next = 'A';
        }

        notifyAll();
        return true;
    }

}
//I CAN NOT UNDERSTAND
