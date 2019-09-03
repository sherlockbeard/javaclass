package quest_9;

public class quest_99 {
    public static void main(String[] args) {
        RegularPolygon R1 = new RegularPolygon(6, 4);
        RegularPolygon R2 = new RegularPolygon(10, 4, 5.6, 7.8);
        R1.getArea();
        R1.getPerimeter();
        R2.getArea();
        R2.getPerimeter();

    }
    static class RegularPolygon{
        private int n;
        private double side;
        private double x;
        private double y;
        RegularPolygon(){
            n =3;
            side= 1;
            x =0;
            y =0;
        }
        RegularPolygon(int n,double side){
            this.n = n;
            this.side =side;
            this.x = 0;
            this.y =0;
        }

        public RegularPolygon(int n, double side, double x, double y) {
            this.n = n;
            this.side = side;
            this.x = x;
            this.y = y;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
        public void getPerimeter(){
            System.out.println("perimeter is : " +getN()*getSide());
        }
        public void getArea(){
            double area = (getN()*Math.pow(getSide(),2))/(4* Math.tan(Math.PI/getN()));
            System.out.println("Area is : "+area);
        }
    }
}
