package practice02;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }


    public String introduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }

}
