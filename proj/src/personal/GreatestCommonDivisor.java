package personal;

import java.util.Random;
import java.util.Scanner;

public class GreatestCommonDivisor {

    static int gcd(int a,int b){
        int current_gcd = 1;
        for(int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }


    static  int euclidgcd(int a,int b){
        if(b==0){
            return a;
        }
        int a1=a%b;
        return euclidgcd(b,a1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(euclidgcd(a,b));
        /*while (true) {
            Random random = new Random();
            int a = random.nextInt(1000000) + 4;
            int b = random.nextInt(1000000) + 6;
            int r1 = gcd(a, b);
            int r2 = euclidgcd(a, b);
            if (r1 == r2) {
                System.out.println("true or right");
            } else {
                System.out.println("r1: " + r1 + " r2: " + r2+" a: "+a+" b: "+b);
                break;
            }
        }*/
    }
}
