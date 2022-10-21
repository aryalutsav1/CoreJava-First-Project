package src.day1;

public class BankAccount {
//    bankName
    private String bankName;
//    branch
    private String branch;
//    accountHolderName
    private String accountHolderName;
//    accountNo
    private long accountNo;
//    accountType
    private String accountType;
//    accHolderDOB
    private String accHolderDOB;
//    accHolderSSN;
    private String SSN;
//    email
    private String email;
//    contactNumber
    private String contactNumber;
//    address
    private String address;
//    balance
    private double balance;
//    interestRate
    private double interestRate;

//    Behaviours
//    checkBalance
//    deposit
//    withdraw
//    transfer
//    applyCreditCare
//    updateContactInfo


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccHolderDOB() {
        return accHolderDOB;
    }

    public void setAccHolderDOB(String accHolderDOB) {
        this.accHolderDOB = accHolderDOB;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
