package day4;

import java.util.*;

public class PositiveString {

public static boolean isPositiveString(String str) {

str = str.toUpperCase();

for (int i = 0; i < str.length() - 1; i++) {
if (str.charAt(i) > str.charAt(i + 1)) {
return false;
}
}

return true;
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter a String: ");
String str = sc.nextLine();

if (isPositiveString(str)) {
System.out.println("It is a Positive String");
} else {
System.out.println("It is NOT a Positive String");
}

sc.close();
}
}