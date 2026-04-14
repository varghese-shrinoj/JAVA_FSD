package pac2;



public class PersonMain {

public static void main(String[] args) {

// Creating object using parameterized constructor
Person p1 = new Person("John", "Doe", 'M');

// Display details
p1.display();

System.out.println("--------------------");

// Using default constructor + setters
Person p2 = new Person();
p2.setFirstName("Jane");
p2.setLastName("Smith");
p2.setGender('F');

// Display details
p2.display();
}
}