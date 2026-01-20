package flowofprogram;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scn.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scn.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
    }
}