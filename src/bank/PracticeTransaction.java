package src.bank;

public class PracticeTransaction {

    public static void main(String[] args) {


        BankAccount person1 =new BankAccount();
        person1.setAccountNo(12345);
        person1.setBalance(555500.00);
        BankAccount person2 = new BankAccount();
        person2.setAccountNo(1111);
        person2.setBalance(100000);

        BankFeatureClass bankFeatureClass = new BankFeatureClass();


        bankFeatureClass.depositTransaction(person1,5000.00);
        bankFeatureClass.depositTransaction(person2,5000.00);
        BankFeatureClass.withdrawTransaction(person1,10000.64);
        BankFeatureClass.withdrawTransaction(person2,5555.36);


    }



}
