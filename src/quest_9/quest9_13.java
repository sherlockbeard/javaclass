package quest_9;

import java.util.Scanner;

public class quest9_13 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns in the array: " );
        Scanner scanner = new Scanner(System.in);
        Location location = new Location();
        location.row = scanner.nextInt();
        location.column = scanner.nextInt();
        System.out.println("Enter the array: ");
        double[][] a = new double[location.row][location.column];
        for(int i=0;i<location.row;i++){
            for(int j=0;j<location.column;j++){
                a[i][j] = scanner.nextDouble();
            }
        }
        Location location1 = locateLArget(a);

        for(int i=0;i<location.row;i++){
            for(int j=0;j<location.column;j++){
                if(location1.maxValue == a[i][j]){
                    System.out.println("The location of the largest element is "+location1.maxValue+" at ("+i+","+j+")");
                }
            }
        }


    }

    public static  Location locateLArget(double[][] a){
        Location location = new Location();
        location.row =0;
        location.column =0;
        double max=0;
        int l1=0,l2=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        location.maxValue = max;
        return location;
    }
    static class Location{
         int row,column;
         double maxValue;


    }
}
