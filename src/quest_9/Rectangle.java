package quest_9;

public class Rectangle {
<<<<<<< HEAD
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
=======
    double width;	
    double height;	


    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }


    double getArea() {
        return width * height;
    }


    double getPerimeter() {
        return 2 * (width + height);
>>>>>>> ga
    }
}
