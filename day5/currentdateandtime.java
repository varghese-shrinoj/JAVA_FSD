package day5;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class currentdateandtime {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String zone = sc.nextLine();

ZonedDateTime z = ZonedDateTime.now(ZoneId.of(zone));

System.out.println(z);
sc.close();
}
}