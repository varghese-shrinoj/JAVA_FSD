package day3interface;

public class CurrrentAccount extends Account {

private double overdraftLimit = 1000;

public CurrrentAccount(Person p, double balance) {
super(p, balance);
}

@Override
public void withdraw(double amt) {
if (getBalance() + overdraftLimit >= amt) {
System.out.println("Withdraw successful");
} else {
System.out.println("Overdraft limit exceeded");
}
}
}
