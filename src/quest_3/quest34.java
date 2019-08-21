package quest_3;

import java.util.Random;

public class quest34 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(12);
        String month = "";
        switch (a){
            case 1: month = "januray";
            case 2: month = "feburay";
            case 3: month = "march";
            case 4: month = "april";
            case 5: month = "may";
            case 6: month ="june";
            case 7: month = "july";
            case 8: month = "august";
            case 9: month = "september";
            case 10: month = "october";
            case 11: month = "novmember";
            case 12: month = "december";
        }
        System.out.println(month);
    }
}
