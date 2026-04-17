package day5;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class localdate {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

LocalDate d1 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
LocalDate d2 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

Period p = Period.between(d1, d2);

System.out.println(p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days");
sc.close();
}
}