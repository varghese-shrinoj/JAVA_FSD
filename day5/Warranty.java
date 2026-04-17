package day5;
import java.time.LocalDate;
import java.util.Scanner;

public class Warranty {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

LocalDate purchaseDate = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

int months = sc.nextInt();
int years = sc.nextInt();

LocalDate expiryDate = purchaseDate.plusYears(years).plusMonths(months);

System.out.println(expiryDate);
sc.close();
}
}