
package difference;

public class Difference {

    public static void main(String[] args) {
        Point2D a = new Point2D(0,0);
        
        System.out.println( a.toString());
        //a.toString();
      
        double distance;
        distance = a.distance(5, 7);
        System.out.println(distance);
        
        a.x = 10; //this is bad bcuz its changable and breaches security
        
        System.out.println(a.x);
    }
    
}
