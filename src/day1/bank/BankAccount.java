package src.day1.bank;

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

    private CustomerInfo CustomerInfo;

    private CustomerAddress CustoerAddress;

    private double balance;

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

    public CustomerInfo getCustomerInfo() {
        return CustomerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        CustomerInfo = customerInfo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CustomerAddress getCustoerAddress() {
        return CustoerAddress;
    }

    public void setCustoerAddress(CustomerAddress custoerAddress) {
        CustoerAddress = custoerAddress;
    }





}
