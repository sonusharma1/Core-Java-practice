
class BankAccountOperation {

    String name, accountNo;
    int password;
    double balance;

    void createAccount (String name, int password, String accountNo, double balance) {
        this.name = name;
        this.password = password;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() {

        String lastFourDigits = accountNo.substring(accountNo.length()-4);
        System.out.println("\n\nName : "+name);
        System.out.println("Account No. : **** **** "+lastFourDigits);   
        System.out.println("Balance : "+balance);   
    }

}

public class Bank {
    public static void main(String[] args) {
        
        BankAccountOperation baop = new BankAccountOperation();
        baop.createAccount("Sonu Sharma", 12345, "1001100205487", 945650.00);
        baop.display();
    }
}
