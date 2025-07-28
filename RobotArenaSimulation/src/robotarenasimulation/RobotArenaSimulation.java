package robotarenasimulation;

public class RobotArenaSimulation {

    public static void main(String[] args) {
        Robot robot[] = new Robot[5];

        for (int i = 0; i < robot.length; i++) {
            String name = "Robot" + (i + 1);
            int power = (int) (Math.random() * 10) + 1;
            int type = (int) (Math.random() * 3) + 1;
            if (type == 1) {
                robot[i] = new Fighter(name, power);
            } else if (type == 2) {
                robot[i] = new Engineer(name, power);
            } else {
                robot[i] = new Medic(name, power);

            }

            robot[i].assignRandomBehaivor();
            robot[i].perform();
        }

    }
}
