package Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double basicPay = in.nextDouble();
        double deduction = in.nextDouble();
        double bonus  = in.nextDouble();

        double hra = basicPay * 0.05;

        double pf = basicPay * 0.2;

        double totalSalary = basicPay + hra - pf - deduction + bonus;

        System.out.println(     "basic pay: " + basicPay +
                                "\ndeduction: " + deduction +
                                "\nhra: " + hra +
                                "\npf: " + pf +
                                "\nbonus: " + bonus +
                                "\n total salary: " + totalSalary);
    }
}
