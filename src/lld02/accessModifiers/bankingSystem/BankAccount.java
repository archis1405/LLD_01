package lld02.accessModifiers.bankingSystem;
/*
    Design a BankAccount class for a banking application.

Requirements:

Attributes:
    Account number
    Account holder name
    Balance
    Account type (Savings/Current)
    Is account active?

Behaviors:
    Deposit money (only positive amounts)
    Withdraw money (only if sufficient balance exists)
    Check balance
    Deactivate account
    Transfer money to another account

Edge Cases to Handle:
    Cannot deposit negative or zero amount
    Cannot withdraw more than available balance
    Cannot withdraw from inactive account
    Cannot transfer to the same account

Create 2 accounts and demonstrate a transfer between them.

 */

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private String acctType;
    private boolean active;

    BankAccount(){

    }

    BankAccount(String accountNumber , String accountName, double balance, String acctType, boolean active){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.acctType = acctType;
        this.active = active;
    }

    void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("The new Balance is : " +balance);
        }
        else{
            System.out.println("Please enter a valid amount for the deposit");
        }
    }

    void withdraw(double amount){
        if(active && balance >= amount){
            balance = balance - amount;
            System.out.println("The new Balance is : " +balance);
        }
        else{
            System.out.println("Cannot Withdraw Insufficient balance");
        }
    }

    void deactivate(){
        if(active){
            active = false;
            System.out.println("Account deactivated");
        }
        else{
            System.out.println("No account found");
        }
    }

    void transfer(BankAccount to , double amount){
        if(this==to){
            System.out.println("Cannot transfer to the same account");
            return;
        }
        if(!this.active){
            System.out.println("Your account is de-activated");
            return;
        }
        if (!to.active) {
            System.out.println("Reciever's account is de-activated");
            return;
        }

        if(amount<=0){
            System.out.println("Enter a valid amount");
            return;
        }
        if(this.balance<amount){
            System.out.println("Insufficient Balance");
            return;
        }

        this.balance -= amount;
        to.balance += amount;

        System.out.println("Transfer Successful");
        System.out.println("New balance is : "+this.balance);
    }

    void display(){
        System.out.println("== ACCOUNT DETAILS ==");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder Name : "+accountName);
        System.out.println("Balance : "+balance);
        System.out.println("Account Type : "+acctType);
        System.out.println("Account Status : "+active);
    }

}
