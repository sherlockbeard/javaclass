package quest_9;

public class Rectangle {
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
    }
}
