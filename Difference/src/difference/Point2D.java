package difference;

public class Point2D {

   //double x; /main.java line 16/
    protected double x;
    protected double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        double z;
        z = Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2);
        return z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        String str = "(x,y) = (" + getX() + "," + getY() + ")";
        return str;
    }

}

//protected can be accessed only within from package.
//public shob jayga theke
// private can be accessed from only the class

// + means public
//- means private
//# protectted
