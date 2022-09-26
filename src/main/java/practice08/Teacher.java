package practice08;

import java.util.Objects;

public class Teacher extends Person {
    Klass klass;

    public Teacher(int id ,String name,int age ) {
        super(1, name,age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(1,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }


    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        if(klass == null){return super.introduce() + " I am a Teacher. I teach No Class.";}
        else{
            return super.introduce() + " I am a Teacher. I teach Class " + this.klass.number + '.';}
    }

    public String introduceWith(Student student) {
        if(student.klass == this.klass){
            return super.introduce() + " I am a Teacher. I teach " + student.name + ".";
        }
        else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.name + ".";}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(klass,student.klass) && Objects.equals(age,student.age) && Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
