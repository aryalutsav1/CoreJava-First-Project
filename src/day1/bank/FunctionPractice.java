package src.day1.bank;

public class FunctionPractice {

    public static void main(String[] args) {


        //    first set of data
        long principal = 5000;
        float rate = 9.55f; //yearly
        int time = 25; // in months
//        int purpose = 1;
        double interest = CalculateRate(principal, rate, time);
        System.out.println("The interest 1  is :" + interest);

//    second set of data

        principal = 6000;
        rate = 8.55f;
        time = 55;
//        purpose = 2;

        interest = CalculateRate(principal, rate, time);
        System.out.println("The interest 2  is :" + interest);


        interest = CalculateRate(18000, 10.50f, 60);
        System.out.println("The interest 3 is :" + interest);

        interest = CalculateRate(3000, 8.55f, 55);
        System.out.println("The interest 4 is :" + interest);

        interest = CalculateRate(30000, 8.55f, 110);
        System.out.println("The interest 5 is :" + interest);


    }

    static double CalculateRate(long p, float r, int n) {
        double noOfYears = n / 12.00;
        return (p * r * noOfYears) / 100;
    }
//    static double Deposit(long principal, double interest){
//        return principal+interest;
//    }
//    static double Withdraw (long principal, double interest){
//        return principal-interest;
//    }
//
//    static double BankTransaction(double withdraw, double deposit, int purpose) {
//        double transaction=0;
//        if (purpose == 1) {
//            return transaction = deposit;
//        } else if (purpose == 2) {
//            return transaction = withdraw;
//        }
//        return transaction;
//
//    }
//


}
