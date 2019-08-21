package quest_4;

import java.util.Scanner;

public class quest418 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String a = scanner.nextLine();
        char a1 = a.charAt(0);
        char a2 = a.charAt(1);
        if(a1 == 'M'){
            System.out.print("Mathematics  ");
        }
        if (a1=='C'){
            System.out.print("Computer Science  ");
        }
        if(a1=='I'){
            System.out.print("Information Technology  ");
        }
        if (a2=='1'){
            System.out.print("Freshman");
        }
        if (a2=='2') System.out.print("sophomore");
        if(a2=='3') System.out.print("junior");
        if(a2=='4') System.out.print("senior");
    }
}
