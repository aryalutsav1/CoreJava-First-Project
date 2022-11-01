package src.day1.bank;

public class EncapsulationPractice {
    public static void main (String [] argus){
        CustomerInfo customerInfo = new CustomerInfo();

        customerInfo.setDob("1997-03-06");
        customerInfo.setEmail("aryal.utsav@yahoo.com");
        customerInfo.setName("Utsav Aryal");
        customerInfo.setSsn("000-00-0000");
        customerInfo.setContactNo("682-718-9421");

        System.out.println("My ame is "+ customerInfo.getName());
        System.out.println("My eail is "+ customerInfo.getEmail());
        System.out.println("My DOB is "+customerInfo.getDob());
        System.out.println("My contact info is "+ customerInfo.getContactNo());


    }
}
