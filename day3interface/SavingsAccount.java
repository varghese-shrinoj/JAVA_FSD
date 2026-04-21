package day3interface;

public class SavingsAccount extends Account {

private final double minBalance = 500;

public SavingsAccount(Person p, double balance) {
super(p, balance);
}

@Override
public void withdraw(double amt) {
if (getBalance() - amt >= minBalance) {
super.withdraw(amt);
} else {
System.out.println("Cannot withdraw, minimum balance required");
}
}
}
