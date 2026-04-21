package day3interface;

public class Account {

private static long count = 1001;

private long accNum;
private double balance;
private Person accHolder;

public Account(Person p, double balance) {
this.accNum = count++;
this.accHolder = p;

if (balance >= 500)
this.balance = balance;
else
this.balance = 500;
}

public void deposit(double amt) {
balance += amt;
}

public void withdraw(double amt) {
if (balance - amt >= 500)
balance -= amt;
else
System.out.println("Minimum balance should be 500");
}

public double getBalance() {
return balance;
}

public String toString() {
return accNum + " " + accHolder.getName() + " " + balance;
}
}