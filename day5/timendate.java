package day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class timendate {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int y = sc.nextInt();
int m = sc.nextInt();
int d = sc.nextInt();

LocalDate inputDate = LocalDate.of(y, m, d);
LocalDate currentDate = LocalDate.now();

Period p = Period.between(inputDate, currentDate);

System.out.println(p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days");
sc.close();
}
}