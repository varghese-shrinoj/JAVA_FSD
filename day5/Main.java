package day5;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String firstName = sc.nextLine();
String lastName = sc.nextLine();
char gender = sc.next().charAt(0);

int y = sc.nextInt();
int m = sc.nextInt();
int d = sc.nextInt();

LocalDate dob = LocalDate.of(y, m, d);

Person p = new Person(firstName, lastName, gender, dob);

System.out.println(p.getFullName());
System.out.println(p.calculateAge());
sc.close();
}
}

