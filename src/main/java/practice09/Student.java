package practice09;

public class Student extends Person {
    Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }


    public Student(int id ,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        if(this == this.klass.leader){
            return super.introduce() + " I am a Student. I am Leader of Class " + this.klass.number + ".";
        }
        return super.introduce() + " I am a Student. I am at Class " + this.klass.number + ".";

    }
}
