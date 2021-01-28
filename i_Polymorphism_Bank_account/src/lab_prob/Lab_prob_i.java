
package lab_prob;

import java.util.Scanner;

class Account{
    private int id;
    private double balance;
    private double annualIntersetRate;
    
    Account(){
        this.id=0;
        this.balance=0;
        this.annualIntersetRate=0;
    }
    
    Account(int id, double balance, double AIR){
        this.id=id;
        this.balance=balance;
        this.annualIntersetRate=AIR;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    public void setAIR(double AIR){
        this.annualIntersetRate=AIR;
    }
    
    public int getID(){
        return this.id;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public double getAIR(){
        return this.annualIntersetRate;
    }
    
    public double getMonthlyInterestRate(){
        double AIR, MIR;
        AIR=this.annualIntersetRate/100;
        MIR=AIR/12;
        return MIR;
    }
    
    public double getMonthlyInterestAmount(){
        double MIA;
        MIA= this.balance* this.getMonthlyInterestRate();
        return MIA;
    }
    
    public void withdraw(double amount){
        this.balance= this.balance-amount;
    }
    
    public void deposite(double amount){
        this.balance= this.balance+amount;
    }
    
    public void print(){
        System.out.println("This is Parent Class");
    }
}

class CheckingAccount extends Account{
    private double overdraftLimit;

    CheckingAccount(int id, double balance, double AIR, double overdraftLimit) {
        super(id, balance, AIR);
        this.overdraftLimit=overdraftLimit;
    }
    public double getOverDraftLimit(){
        return this.overdraftLimit;
    }
    
    public void print_CA(){
        System.out.println("This is Child Class");
    }
}

class SavingsAccount extends Account{
    private long credCardNum;
    SavingsAccount(int id, double balance, double AIR, long credCardNum){
        super(id, balance, AIR);
        this.credCardNum=credCardNum;
    }
    
    public double getCreditBalance(){
        return this.getBalance()*3;
    }
    
    public void print_SA(){
        System.out.println("This is Child Class");
    }
}

public class Lab_prob_i {

    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Account acc= new Account(1, 5000, 4.5);
        CheckingAccount c_acc= new CheckingAccount(2, 10000, 6.5, 50000);
        System.out.println("GetMonthlyInterestRate method called from parent class by object of parent class: ");
        System.out.println(acc.getMonthlyInterestRate());
        acc.print();
        System.out.println("");
        System.out.println("GetOverDraftLimit method from child class Checking Account by object of child class: ");
        System.out.println(c_acc.getOverDraftLimit());
        c_acc.print_CA();
        System.out.println("GetMonthlyInterestAmount method called from parent class by object of child class: ");
        System.out.println(c_acc.getMonthlyInterestAmount());
        c_acc.print();
    }
    
}
