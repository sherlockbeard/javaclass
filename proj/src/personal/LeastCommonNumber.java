package personal;

import java.util.Scanner;

public class LeastCommonNumber {

    static  int Gcd(int a,int b){
        if(b==0){
            return a;
        }
        int a1= a%b;
        return Gcd(b,a1);
    }

    static int Lcm(int a,int b){
        int gcd = Gcd(a,b);
        int lcm = (a*b)/gcd;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Lcm is : "+Lcm(a,b));

    }
}
