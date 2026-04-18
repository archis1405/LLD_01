package lld02.accessModifiers.bankingSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("101", "Raghu", 1000, "Savings", true);
        BankAccount acc2 = new BankAccount("102", "Aman", 500, "Current", true);

        // Initial state
        acc1.display();
        acc2.display();

        System.out.println(" ");
        System.out.println("--- Deposit ---");
        acc1.deposit(200);
        System.out.println("");
        acc1.deposit(-50); // invalid

        System.out.println(" ");
        System.out.println("--- Withdraw ---");
        acc1.withdraw(300);
        System.out.println("");
        acc1.withdraw(2000); // insufficient
        acc1.withdraw(-10);  // invalid

        System.out.println(" ");
        System.out.println("--- Transfer ---");
        acc1.transfer(acc2, 400);
        System.out.println("");
        acc1.transfer(acc2, 5000); // insufficient
        acc1.transfer(acc1, 100);  // same account

        System.out.println(" ");
        System.out.println("--- Deactivate ---");
        acc1.deactivate();
        System.out.println("");
        acc1.withdraw(100); // inactive
        acc1.transfer(acc2, 100); // inactive

        System.out.println("");
        System.out.println("--- Final State ---");
        acc1.display();
        System.out.println("");
        acc2.display();
    }
}
