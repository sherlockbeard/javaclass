package quest_3;

import java.util.Scanner;

public class quest35 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int a  = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int b = scanner.nextInt();
        b =a+b;
        if(b>6){
            b = b%7;
        }
        String s = "";
        switch (b){
            case 0:
                s="Sunday";
                break;
            case 1:
                s = "Monday";
                break;
            case 2:
                s= "Tuesday";
                break;
            case 3:
                s = "Wenesday";
                break;
            case 4:
                s = "Thrusday";
                break;
            case 5:
                s = "Friday";
                break;
            case 6:
                s = "Staurday";
                break;
        }
        System.out.print(s);

    }
}
