package quest_4;

import java.util.Scanner;

public class quest413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char a = scanner.next().charAt(0);
        if(a=='a'||a=='A'||a=='E'||a=='e'||a=='u'||a=='U'||a=='i'||a=='I'||a=='o'||a=='O'){
            System.out.println("It is a vowel");
        }else{
            System.out.println("not a vowel");
        }
    }
}
