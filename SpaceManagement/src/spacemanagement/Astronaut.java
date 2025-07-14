package spacemanagement;

public class Astronaut extends Personnel {

    private int missionCount;
    private String[] certifications;
    private int maxCerts;
    private int certCount;

    public Astronaut(String id, String name, int years, String role, int maxCerts) {
        super(id, name, role, years);
        this.maxCerts = maxCerts;
        certifications = new String[maxCerts];
        certCount = 0;
        missionCount = 0;
    }

    public int getMissionCount() {
        return missionCount;
    }

    public boolean addCertifications(String cert) {
        if (certCount >= maxCerts) {
            return false;
        } else {
            for (int i = 0; i < certCount; i++) {
                if (certifications[i].equalsIgnoreCase(cert)) {
                    return false;
                }
            }
            certifications[certCount] = cert;
            return true;
        }
    }

    public String[] getCertifications() {
        return certifications;
    }

    public void incrementMissions() {
        missionCount++;
    }

    public void displayPersonnelInfo() {
        super.displayPersonnelInfo();
        System.out.println("Mission Count: " + getMissionCount());
        for (int i = 0; i < maxCerts; i++) {
            System.out.println(certifications[i]);
            System.out.println("");
        }
    }

}
