import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by scott_000 on 9/30/2016.
 */
public class Account {
    //declare variables
    public int id = 0;
    public double balance = 0;
    public double annualInterestRate = 0;
    public double deposit;
    public double withdraw;
    public String name;
    private java.util.Date dateCreated;
    ArrayList<Integer> transactions = new ArrayList<Integer>();


    Account() {

    }

    Account(int x, double y) {
        id = x;
        balance = y;
    }

    Account(String name, int x, double y){
        id = x;
        balance = y;
        name = name;
    }

    double getMonthlyInterestRate(double y) {
        annualInterestRate = y;
        return (annualInterestRate / 100) / 12;
    }

    double getMonthlyInterest(double i) {
        return balance * i;
    }

    double getDeposit(double d) {
        balance = balance + d;
        return balance;
    }

    public static void getWithdraw(double w, double[] balanceArray, int currentID) {
        balanceArray[currentID] = balanceArray[currentID] - w;

    }

    public static void getDeposit(double d, double[] balanceArray, int currentID) {
        balanceArray[currentID] = balanceArray[currentID] + d;
    }

    public java.util.Date getDateCreated() {
        dateCreated = new java.util.Date();
        return dateCreated;
    }

    public static void mainMenu(double balanceArray[]) {
        //get ID number from User
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ID (0-9): ");
        int currentID = input.nextInt();
        if (currentID >= 9) {
            System.out.println("Incorrect ID. Enter an ID (0-9): ");
            currentID = input.nextInt();
        }


        //get menu choice
        System.out.print("Main Menu" + "\n1: check balance: " + "\n2: withdraw" + "\n3: deposit" + "\n4: exit"
                + "\nEnter a choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            Account.getBalance(choice, balanceArray);
            mainMenu(balanceArray);
        }

        if (choice == 2) {
            System.out.print("Enter an amount to withdraw: ");
            double withdraw = input.nextDouble();
            Account.getWithdraw(withdraw, balanceArray, currentID);
            mainMenu(balanceArray);
        }

        if (choice == 3) {
            System.out.print("Enter an amount to deposit: ");
            double deposit = input.nextDouble();
            Account.getDeposit(deposit, balanceArray, currentID);
            mainMenu(balanceArray);
        }

        if (choice == 4) {
            mainMenu(balanceArray);
        }

    }


    public static void getBalance(int currentID, double[] balanceArray) {

        System.out.println(balanceArray[currentID]);

    }
}
    class CheckingAccount extends Account{
        int currentId;
        double balance;

        public CheckingAccount(int currentId, double balance){
            this.currentId = currentId;
            this.balance = balance;

        }


        @Override
        public String toString() {
            if (balance < 0)
                return "Checking Balance is overdrawn.";
            else
                return "Your balance for Checking Account " + currentId + " is: " + balance;
        }


    }

    class SavingsAccount extends Account{
        int currentId;
        double savingsBalance;

        public SavingsAccount(){

        }
        public SavingsAccount(int currentId, double savingsBalance){
            this.currentId = currentId;
            this.savingsBalance = savingsBalance;
        }

        public String toString(){
            return "Your balance for Savings Account " + currentId + " is: " + savingsBalance;
        }
    }

class Transaction extends Account{
    Date date;
    char type;
    double amount;
    double balance;
    String description;


    //Getters and Setters
    public void setDate(){
        Date date = new Date();
        date.getTime();
    }




    public Date getDate(){
        return date;
    }

    public void setType(){
        this.type = type;
    }

    public char getType(){
        return type;
    }

    public void setAmount(){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public void setBalance(){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setDescription(){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    //Default Constructor
    public Transaction(){

    }

    //Constructor
    public Transaction(char type, double amount, double balance, String description){

    }



}




