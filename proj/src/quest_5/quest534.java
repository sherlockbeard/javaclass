package quest_5;

import java.util.Random;
import java.util.Scanner;

public class quest534 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int user_win =0;
        int comp_win =0;
        while(user_win<4 && comp_win<4){
            System.out.println("ENter the choice 0,1,2 for rock,paper,scissors recpec.");
            int user_choice = scanner.nextInt();
            int comp_choice = random.nextInt(3);
            if(user_choice==0 && comp_choice==1){
                System.out.println("Comp wins this round");
                comp_win++;
            }else if(user_choice ==1 && comp_choice ==0){
                System.out.println("user wins this round");
                user_win++;
            }else if(user_choice ==0 && comp_choice ==2){
                System.out.println("user wins this round");
                user_win++;
            }else if(user_choice ==1 && comp_choice ==2){
                System.out.println("comp wins this round");
                comp_win++;
            }else if(user_choice==2 && comp_choice==0){
                System.out.println("comp wins this round");
                comp_win++;
            }else if(user_choice==2 && comp_choice==1){
                System.out.println("user wins this round");
                user_win++;
            }else{
                System.out.println("Draw");
            }
        }
        System.out.println((user_win>comp_win)?"user wins":"comp wins");
    }
}
