package spacemanagement;

public class Mission {

    private String missionID;
    private String name;
    private MissionCommander commander;
    private Personnel[] personnel;
    private int maxPersonnel;
    private Equipment[] equipment;
    private int maxEquipment;

    int personnelCount = 0;
    int equipmentCount = 0;

    public Mission(String missionID, String name, MissionCommander commander, int maxPersonnel, int maxEquipment) {
        this.missionID = missionID;
        this.name = name;
        this.commander = commander;
        this.maxPersonnel = maxPersonnel;
        this.maxEquipment = maxEquipment;

        personnel = new Personnel[maxPersonnel];
        equipment = new Equipment[maxEquipment];

    }

    public boolean addPersonnel(Personnel p) {
        if ((personnelCount >= maxPersonnel) || (p == commander)) {
            return false;
        } else {
            for (int i = 0; i < personnelCount; i++) {
                if (personnel[i] != null && personnel[i].getPersonnelID().equals(p.getPersonnelID())) {
                    return false;
                }
            }

            personnel[personnelCount] = p;
            personnelCount++;
            return true;

        }
    }

    public boolean addEquipment(Equipment e) {
        if ((equipmentCount >= maxEquipment)) {
            return false;
        } else {
            for (int i = 0; i > equipmentCount; i++) {
                if (equipment[i] != null && equipment[i].getEquipID().equals(e.getEquipID())) {
                    return false;
                }
            }

            equipment[equipmentCount] = e;
            equipmentCount++;
            return true;

        }
    }

    public int getPersonnelCount() {
        return personnelCount;
    }

    public int getEquipmentCount() {
        return equipmentCount;
    }

    public MissionCommander getCommander() {
        return commander;
    }

    public boolean validateMission() {

        if (personnelCount >= 2 && equipmentCount >= 1 && (commander.getCertifications().length > 0)) {
            System.out.println("Mission is Validated!");
            return true;

        } else {
            System.out.println("Mission is not Validated!");
            return false;
        }
    }

    public String getMissionID() {
        return missionID;
    }

    public String getName() {
        return name;
    }

    public void displayEquipmentInfo() {
        System.out.println("Id: " + getMissionID());
        System.out.println("Name: " + getName());
        commander.displayPersonnelInfo();

        for (int i = 0; i < personnelCount; i++) {
            personnel[i].displayPersonnelInfo();
        }

        for (int i = 0; i < equipmentCount; i++) {
            equipment[i].displayEquipmentInfo();
        }
    }

}
