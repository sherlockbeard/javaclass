package personal;

import java.util.Random;
import java.util.Scanner;

public class Fibonacci_Number {

    static int fabonacii(int n){
        if(n<=1){
            return n;
        }
        return fabonacii(n-1)+fabonacii(n-2);
    }

    static int fabonaciifast(int n){
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        for(int i = 2;i<=n;i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[n];
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fabonaciifast(n));

        /*Random random = new Random();
        int n = random.nextInt(12)%12 + 2;
        int r1 = fabonacii(n);
        int r2 = fabonaciifast(n);
        if(r1==r2){
            System.out.println("Things are right");
        }else{
            System.out.println("The result: "+r1+" "+r2+ " They don't match each other");
        }*/
    }
}
