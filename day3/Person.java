package day3;

public class Person {

private String firstName;
private String lastName;
private Gender gender;
private String phoneNumber;


public Person() {
}


public Person(String firstName, String lastName, Gender gender, String phoneNumber) {
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.phoneNumber = phoneNumber;
}


public String getFirstName() {
return firstName;
}

public String getLastName() {
return lastName;
}

public Gender getGender() {
return gender;
}

public String getPhoneNumber() {
return phoneNumber;
}


public void setFirstName(String firstName) {
this.firstName = firstName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public void setGender(Gender gender) {
this.gender = gender;
}

public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}


public void display() {
System.out.println("Person Details:");
System.out.println("First Name : " + firstName);
System.out.println("Last Name : " + lastName);
System.out.println("Gender : " + gender);
System.out.println("Phone No : " + phoneNumber);
}
}