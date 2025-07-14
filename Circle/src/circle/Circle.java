public class Circle {
    double radius;

    Circle(){
        radius = 0;
    }
    Circle(double newRadius){
        this.radius = newRadius;
    }

    double getArea(){
        return Math.PI * radius * radius;
    }

}