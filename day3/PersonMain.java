package day3;

public class PersonMain {

public static void main(String[] args) {


Person p1 = new Person("John", "Doe", Gender.M, "9876543210");
p1.display();

System.out.println("---------------------");


Person p2 = new Person();
p2.setFirstName("Jane");
p2.setLastName("Smith");
p2.setGender(Gender.F);
p2.setPhoneNumber("9123456780");

p2.display();
}
}