package spacemanagement;

public class MissionLog {

    private String logID;
    private Mission mission;
    private Astronaut leadAstronaut;
    private String status;
    private String[] events;
    private int maxEvents;
    private int eventCount;
    
    int eventsCount = 0;

    public MissionLog(String logID, Mission mission, Astronaut leadAstronaut, String status, int maxEvents) {
        this.logID = logID;
        this.mission = mission;
        this.leadAstronaut = leadAstronaut;
        this.status = status;
        this.maxEvents = maxEvents;
        events = new String[maxEvents];
        eventCount = 0;
    }

    public String getLogID() {
        return logID;
    }

    public Mission getMission() {
        return mission;
    }

    public Astronaut getLeadAstronaut() {
        return leadAstronaut;
    }

    public boolean addEvent(String event) {
        if (eventsCount >= maxEvents) {
            return false;
        } else {

            events[eventsCount] = event;
            return true;

        }
    }

    public void completeMission() {
        status = "Misssion completed";
        leadAstronaut.incrementMissions();
        mission.getCommander().incrementMissions();
    }

    public void displayLogDetails() {
        System.out.println("Log Id: " + getLogID());
        System.out.println("Mission ID: " + mission.getMissionID());
        System.out.println("Lead Astronaut: " + getLeadAstronaut());
        System.out.println("Status: " + status);

        for (int i = 0; i < eventsCount; i++) {
            System.out.println(events[i]);
        }

    }

}
