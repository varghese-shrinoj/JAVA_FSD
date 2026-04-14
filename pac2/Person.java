package pac2;


public class Person {


private String firstName;
private String lastName;
private char gender;


public Person() {
}


public Person(String firstName, String lastName, char gender) {
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
}


public String getFirstName() {
return firstName;
}

public String getLastName() {
return lastName;
}

public char getGender() {
return gender;
}


public void setFirstName(String firstName) {
this.firstName = firstName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public void setGender(char gender) {
this.gender = gender;
}

public void display() {
System.out.println("Person Details:");
System.out.println("First Name : " + firstName);
System.out.println("Last Name : " + lastName);
System.out.println("Gender : " + gender);
}
}