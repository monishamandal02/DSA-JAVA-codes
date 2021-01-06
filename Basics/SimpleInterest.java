package userinput;

import java.util.Scanner;
public class SimpleInterest{
    public static void main (String[]args)
    {
        float principal, rate, time;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        principal = sc.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        rate = sc.nextFloat();
        System.out.print("Enter the Time period : ");
        time = sc.nextFloat();
        float Simple_Interest;
        Simple_Interest = (rate * time * principal) / 100;
        System.out.print("The Simple Interest is : " + Simple_Interest);
    }  
}