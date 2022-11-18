package src.InputPractice;

import java.util.Scanner;

public class CalculateAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter student name: - ");
        String studentName = sc.nextLine();
        System.out.print("Please Enter student score in Math: - ");
        double scoreMath = sc.nextDouble();
        System.out.print("Please Enter student score in Science: - ");
        double scoreScience = sc.nextDouble();
        System.out.print("Please Enter student score in History: - ");
        double scoreHistory = sc.nextDouble();
        System.out.print("Please Enter student score in Art: - ");
        double scoreArt = sc.nextDouble();
        System.out.print("Please Enter student score in English: - ");
        double scoreEnglish = sc.nextDouble();

        double totalScored = scoreArt+scoreEnglish+scoreHistory+scoreMath+scoreScience;
        double possibleFullMark = 500;
        double averagePercentage = (totalScored/possibleFullMark)*100;
        System.out.println("The total score scored by "+studentName+" is "+totalScored+".");
        System.out.println(studentName+" Scored "+ averagePercentage+" % in the exam.");
        System.out.println(String.format("%s scored %.4f in final exam",studentName,averagePercentage));

//        System.out.println("");
        sc.close();

    }
}
