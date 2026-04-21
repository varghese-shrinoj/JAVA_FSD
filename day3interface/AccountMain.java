package day3interface;

public class AccountMain {

public static void main(String[] args) {

Person smith = new Person("Smith", 30);
Person kathy = new Person("Kathy", 28);

// Savings Account
SavingsAccount sAcc = new SavingsAccount(smith, 2000);

// Current Account
CurrrentAccount cAcc = new CurrrentAccount(kathy, 3000);

sAcc.deposit(2000);
sAcc.withdraw(1000);

cAcc.withdraw(3500);

System.out.println("Savings Balance: " + sAcc.getBalance());
System.out.println("Current Balance: " + cAcc.getBalance());
}
}