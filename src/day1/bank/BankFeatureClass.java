package src.day1.bank;

public class BankFeatureClass {

         void depositTransaction ( BankAccount accountNumber, double amountToBeDeposit){

             System.out.println("The initial balance of account no. '"+accountNumber.getAccountNo()+"' is "+ accountNumber.getBalance());
            accountNumber.setBalance(accountNumber.getBalance()+ amountToBeDeposit);
            System.out.println("The new balance of account no. '"+accountNumber.getAccountNo()+"' after the deposit of $$$ "+amountToBeDeposit+" is $$$ " +accountNumber.getBalance());




        }
        static void withdrawTransaction(BankAccount accountNumber, double amountToWithdraw){
            System.out.println("The current balance of account no. '"+accountNumber.getAccountNo()+"' is "+ accountNumber.getBalance());
            accountNumber.setBalance(accountNumber.getBalance()-amountToWithdraw);
            System.out.println("The new balance of account no. '"+accountNumber.getAccountNo()+"' after the withdrawl of $$$ "+amountToWithdraw+" is $$$" +accountNumber.getBalance());

        }




}
