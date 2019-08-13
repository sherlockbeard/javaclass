package quest_3;

import java.util.Scanner;

public class quest311 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month : ");
        int month = scanner.nextInt();
        System.out.print("Enter the year : ");
        int year = scanner.nextInt();
        int leap =0;
        if(year%4 ==0){
            if(year%100==0){
                if(year%400==0){
                    leap = 1;
                }
            }else {
                leap = 1;
            }
        }
        if(month ==1&&month ==3&&month ==5&&month ==7&&month==8&&month==10&&month==12) {
            System.out.print("31 days");
        }else{
            if(month ==2){
                if(leap ==0) {
                    System.out.print("28 days");
                }
                else{
                    System.out.print("29 days");
                }
            }else {
                System.out.print("30 days");
            }
        }

    }
}
