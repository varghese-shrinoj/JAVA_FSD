package day6;
import java.util.Scanner;
import java.util.Arrays;

public class Array {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter number of products: ");
int n = sc.nextInt();
sc.nextLine(); // consume newline

String[] products = new String[n];

// Taking input from user
System.out.println("Enter product names:");
for (int i = 0; i < n; i++) {
products[i] = sc.nextLine();
}

// Sorting the array
Arrays.sort(products);

// Displaying sorted products
System.out.println("\nSorted Product Names:");
for (int i = 0; i < products.length; i++) {
System.out.println(products[i]);
}

sc.close();
}
}