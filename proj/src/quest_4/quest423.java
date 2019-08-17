package quest_4;

import java.util.Scanner;

public class quest423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("employee's name: ");
        String name = scanner.nextLine();
        System.out.print("number of hours worked in a week: ");
        int hour_work = scanner.nextInt();
        System.out.print("hourly pay rate: ");
        double hourly_pay = scanner.nextDouble();
        System.out.print("federal tax withholding rate: ");
        double federal_tax = scanner.nextDouble();
        System.out.print("state tax withholding rate: ");
        double state_tax = scanner.nextDouble();
        double net_pay;
        System.out.println("Employee Name: "+name);
        System.out.println("Hours Worked: "+hour_work);
        System.out.println("Pay Rate: "+hourly_pay);
        net_pay = hourly_pay*hour_work;
        System.out.println("Gross Pay: "+net_pay);
        System.out.println("Deductions: ");
        System.out.println("Federal Withholding (20.0%): "+net_pay*federal_tax);
        System.out.println("State Withholding (9.0%): "+net_pay*state_tax);
        System.out.println("Total Deduction: "+String.format("%.4f",net_pay*(federal_tax+state_tax)));
        net_pay -= net_pay*(federal_tax+state_tax);
        System.out.println("Net pay: "+net_pay);

    }
}
