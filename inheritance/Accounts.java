package inheritance;

public class Accounts {
    
    int balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    Accounts() {
        balance = 20000;
        accountNumber = 123456789;
        accountHoldersName = "Parth Sharma";
        address = "Noida";
    }

    Accounts(int balance, int accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountHoldersName = accountHoldersName;
        this.accountNumber = accountNumber;
        this.address = address;
    }

    void display() {
        System.out.println("Account Holder's Name: " + accountHoldersName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Accounts defaultAccount = new Accounts();
        defaultAccount.display();

        Accounts customAccount = new Accounts(50000, 987654321, "Parth Sharma", "Mumbai");
        customAccount.display();
    }
}
