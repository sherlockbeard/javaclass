package quest_3;

import java.util.Scanner;

public class quest39 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entter the 9 digit");
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();
        int d5 = input.nextInt();
        int d6 = input.nextInt();
        int d7 = input.nextInt();
        int d8 = input.nextInt();
        int d9 = input.nextInt();
        int d10 = input.nextInt();
        int d11 = input.nextInt();
        int d12 = input.nextInt();

        int d13 = 10 - (d1 + 3*d2 + d3 + 3*d4 + d5 + 3*d6 + d7 + 3*d8 + d9 + 3*d10 + d11 + 3*d12 )%10;
        if(d13 ==10){
            System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10+""+d11+""+d12+""+"0");
        }
        else {
            System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10);
        }
    }
}
