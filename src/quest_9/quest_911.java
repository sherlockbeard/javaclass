package quest_9;

public class quest_911 {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation(3,2,1,4,5,6);
        if(!linearEquation.isSolvable()){
            System.out.print("The equation has no solution.");
        }else{
            System.out.println("Roots are x: "+linearEquation.getX()+"\ny: "+linearEquation.getY());
        }

    }
    static class LinearEquation{
        private double a,b,c,d,e,f;

        public LinearEquation(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getD() {
            return d;
        }

        public double getE() {
            return e;
        }

        public double getF() {
            return f;
        }
        public boolean isSolvable(){
            return ((getA()*getD())-(getC()*getB()))!=0;
        }
        public  double getX(){
            return ((getE()*getD())-(getB()*getF()))/((getA()*getD())-getB()*getC());
        }
        public  double getY(){
            return ((getA()*getF())-(getE()*getC()))/((getA()*getD())-getB()*getC());
        }

    }
}
