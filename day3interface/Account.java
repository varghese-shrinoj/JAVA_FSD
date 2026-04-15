package day3interface;

public class Account {

private static long counter = 1001;

private long accNum;
private double balance;
private Person accHolder;

public Account(Person accHolder, double balance) {
this.accNum = counter++;
this.accHolder = accHolder;

if (balance >= 500) {
this.balance = balance;
} else {
this.balance = 500;
}
}

public void deposit(double amount) {
balance += amount;
}

public void withdraw(double amount) {
if (balance - amount >= 500) {
balance -= amount;
}
}

public double getBalance() {
return balance;
}

public String toString() {
return "Account No: " + accNum +
"\nName : " + accHolder.getName() +
"\nAge : " + accHolder.getAge() +
"\nBalance : " + balance;
}
}