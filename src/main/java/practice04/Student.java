package practice04;

public class Student extends Person{
    int Klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    public String introduce() {
        return super.basicIntroduce() + " I am a Student. I am at Class " + this.Klass + ".";
    }
}
