package day5;


import java.time.LocalDate;
import java.time.Period;

public class Person {

private String firstName;
private String lastName;
private char gender;
private LocalDate dob;

public Person(String firstName, String lastName, char gender, LocalDate dob) {
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.dob = dob;
}

public int calculateAge() {
return Period.between(dob, LocalDate.now()).getYears();
}

public String getFullName() {
return firstName + " " + lastName;
}

public char getGender() {
return gender;
}
}
