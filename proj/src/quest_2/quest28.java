package quest_2;

import java.util.Scanner;

public class quest28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the tiem zone offset to GMT:");
        double offset = input.nextDouble();
        double current_time_mili = System.currentTimeMillis();
        double current_totalSecond = current_time_mili / 1000;
        double currentSecond = current_totalSecond % 60;
        double totalMinutes = current_totalSecond / 60;
// Compute the current minute in the hour
        double currentMinute = totalMinutes % 60;
// Obtain the total hours
        double totalHours = totalMinutes / 60;
// Compute the current hour
        double currentHour = totalHours % 24;
        System.out.println(currentHour+" hour"+currentMinute+" min");

    }
}

