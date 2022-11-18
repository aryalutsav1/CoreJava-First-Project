package src.conditionalstatements;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your percentage: ");
        double percentage = sc.nextDouble();
        sc.close();
        String division="failed";

        if (percentage>=80){
            division = "Distinction";
        } else if (percentage>=60) {
            division="First";
        } else if (percentage>=50) {
            division="Second";
        } else if (percentage>=40) {
            division="Third";
        }
        System.out.println(String.format("You have scored %.2f percentage and placed in %s division.",percentage,division));
        System.out.println("The execuation is completed");
    }
}
