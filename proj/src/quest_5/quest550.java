package quest_5;

import java.util.Scanner;

public class quest550 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = scanner.nextLine();
        int num_upp = 0;
        for (int i=0;i<a.length();i++){
            if(a.charAt(i)>'A' && a.charAt(i)<'Z'){
                num_upp++;
            }
        }
        System.out.print("The number of uppercase letters is "+num_upp);
    }
}
