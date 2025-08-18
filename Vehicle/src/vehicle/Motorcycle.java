package vehicle;

public class Motorcycle extends Vehicle {

    private int engineCC;

    public Motorcycle(int engineCCengineCC, int id, String brand, int year) {
        super(id, brand, year);
        this.engineCC = engineCC;
    }

    public int getEngineCC() {
        return engineCC;
    }
    
    public String getType(){
        return "Motorcycle";
    }
    
    public String toString() {
        return super.toString() + ",EngineCC: "+getEngineCC();
    }
}
    