package com.pluralsight;
import java.util.*;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double regHours = 40;
        double otRate = 1.5;


//prompt user to enter their name
        System.out.print("Please enter your name: ");
        String name = s.nextLine();

//user must enter hours worked
        System.out.print("How many hours did you work? ");
        double hrsWorked = s.nextDouble();
        s.nextLine();

//user must enter pay rate
        System.out.print("What is your pay rate? ");
        double hrlyRate = s.nextDouble();
        s.nextLine();

//calculate gross pay
        if (hrsWorked <= regHours) {
            double grossPay = hrsWorked * hrlyRate;
            System.out.print("Hi " + name + "!, Your gross pay is " + grossPay);
        }

        else if (hrsWorked > regHours) {
            double grossPay = (hrlyRate * hrsWorked);
            double overtimeHrs = (hrsWorked - regHours);
            double overtimePay = (hrlyRate * otRate * overtimeHrs);
            double OTPayTotal = (grossPay + overtimePay);

            System.out.print("Hi " + name + "!, Your pay with overtime is " + OTPayTotal);
        }
    }

}




















