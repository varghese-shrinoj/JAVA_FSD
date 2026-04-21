package day3interface;

public class Person {

private String name;
private float age;

public Person(String name, float age) {
this.name = name;
this.age = age;
}

public String getName() {
return name;
}

public float getAge() {
return age;
}
}