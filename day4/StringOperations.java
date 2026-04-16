package day4;

import java.util.Scanner;

public class StringOperations {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter a string: ");
String str = sc.nextLine();

System.out.println("Choose option:");
System.out.println("1. Add string to itself");
System.out.println("2. Replace odd positions with #");
System.out.println("3. Remove duplicate characters");
System.out.println("4. Change odd characters to uppercase");

System.out.print("Enter your choice: ");
int choice = sc.nextInt();

String result = "";

if (choice == 1) {

// Add string to itself
result = str + str;

} else if (choice == 2) {

// Replace odd positions with #
for (int i = 0; i < str.length(); i++) {
if (i % 2 == 0) {
result = result + str.charAt(i);
} else {
result = result + '#';
}
}

} else if (choice == 3) {

// Remove duplicates
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);

if (result.indexOf(ch) == -1) {
result = result + ch;
}
}

} else if (choice == 4) {

// Change odd characters to uppercase
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);

if (i % 2 != 0) {
result = result + Character.toUpperCase(ch);
} else {
result = result + ch;
}
}

} else {
System.out.println("Invalid choice");
return;
}

System.out.println("Result: " + result);

sc.close();
}
}
