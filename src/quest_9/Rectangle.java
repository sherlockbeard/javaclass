package quest_9;

public class Rectangle {
    double w;	
    double h;	
    
    Rectangle() {
        w = 1;
        h = 1;
    }
    
    Rectangle(double neww, double newh) {
        w = neww;
        h = newh;
    }

    double getArea() {
        return w * h;
    }

    double getPerimeter() {
        return 2 * (w + h);
    }
}
