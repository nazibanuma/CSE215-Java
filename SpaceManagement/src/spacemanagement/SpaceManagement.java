package spacemanagement;

public class SpaceManagement {

    public static void main(String[] args) {
        Personnel[] P = new Personnel[4];
        P[0] = new Personnel("P001", "john Doe", "Technician", 5);
        P[1] = new Personnel("P002", "john Roe", "Engineer", 8);
        P[2] = new Personnel("P003", "Alice Smith", "Scientist", 3);
        P[3] = new Personnel("P004", "Bob Jones", "Analyst", 6);

        Astronaut[] A = new Astronaut[2];
        A[0] = new Astronaut("A001", "Tom Hawk", 10, "Pilot", 3);
        A[1] = new Astronaut("A002", "Sara Lee", 17, "Navigator", 2);

        MissionCommander C1 = new MissionCommander("C001", "Cmdr. Kelly", "Commander", 15, 4, 4, 10000.0);

        A[0].addCertifications("Zero-G Training");
        A[1].addCertifications("Eva Specialist");

        A[1].addCertifications("Navigation Systems");
        C1.addCertifications("Command Training");
        C1.addCertifications("Mission Training");

        Equipment[] E = new Equipment[2];
        E[0] = new Equipment("E001", "Oxygen Tank", 5000.0);
        E[1] = new Equipment("E002", "Rover Unit", 2500.0);

        Mission[] M = new Mission[2];
        M[0] = new Mission("M001", "Mars Exploration", C1, 4, 3);
        M[1] = new Mission("M002", "Lunar Survey", C1, 3, 2);

        M[0].addEquipment(E[0]);
        M[0].addEquipment(E[1]);
        M[0].addPersonnel(P[0]);
        M[0].addPersonnel(P[1]);
        M[0].addPersonnel(A[1]);

        M[1].addPersonnel(P[2]);
        M[1].addPersonnel(A[1]);

    }

}
