package quest_4;

import java.util.Scanner;


public class quest42 {

    public static void main(String[] args) {
        final  double RADIUS = 6371.010;
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        String one = scanner.nextLine();
        int a = 0;
        for(int i =0;i<one.length();i++){
            if(one.toCharArray()[i]==','){
                a= i;
            }
        }
        double x1 = Double.parseDouble(one.substring(0,a));
        double y1 = Double.parseDouble(one.substring(a+1));
        System.out.println(x1);
        System.out.println(y1);


        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        String two = scanner.nextLine();
        int b = 0;
        for(int i =0;i<two.length();i++){
            if(two.toCharArray()[i]==','){
                b= i;
            }
        }
       double x2 = Double.parseDouble(one.substring(0,b));
        double y2 = Double.parseDouble(one.substring(b+1));

        System.out.println(x2);
        System.out.println(y2);
*/
       String i1 = scanner.nextLine();
       String i2 = scanner.nextLine();

       Scanner one = new Scanner(i1).useDelimiter(", ");
        Scanner two = new Scanner(i2).useDelimiter(", ");
        double x1 = Double.parseDouble(one.next());
        double y1 = Double.parseDouble(one.next());

        double x2 = Double.parseDouble(two.next());
        double y2 = Double.parseDouble(two.next());


        double d= RADIUS*Math.acos((Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2)))+(Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2)))*Math.cos(Math.toRadians(y1-y2)));

        System.out.println(d);
        //double r = RADIUS*Math.acos(Math.sin(Math.))
    }
}
