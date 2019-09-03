package quest_9;

public class quest_910 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(6,5,3);
        if(quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has no roots.");
        }else{
            System.out.println("Roots are x: "+quadraticEquation.getRoot1()+"\ny: "+quadraticEquation.getRoot2());
        }

    }
    static class QuadraticEquation{
        private double a,b,c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
        public double getDiscriminant(){
            return ((Math.pow(getA(),2)-(4*getA()*getB())));
        }
        public double getRoot1(){
            if(getDiscriminant()<0){
                return 0;
            }
            return (-b+getDiscriminant())/(2*a);
        }
        public double getRoot2(){
            if(getDiscriminant()<0){
                return 0;
            }
            return (-b-getDiscriminant())/(2*a);
        }
    }
}
