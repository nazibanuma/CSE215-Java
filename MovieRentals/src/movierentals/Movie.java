package movierentals;

public abstract class Movie extends Rentalitem{
    
    private boolean isRented;
    private int renterID;

    public void setIsRented(boolean isRented,int renterID) {
        
        this.isRented = isRented;
    }
    
    public abstract String toString();
      
    
    
}
