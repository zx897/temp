package practice11;

import java.util.LinkedList;
import java.util.Objects;


public class Teacher extends Person {
    Klass klass;
    int id;
    int age;
    LinkedList<Klass> linkedList = new LinkedList<Klass>();

    public LinkedList<Klass> getClasses() {
        return this.linkedList;
    }


    public void setClasses(LinkedList<Klass> linkedList) {
        this.linkedList = linkedList;
    }

    public Teacher(int id, String name, int age, Klass klass, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.klass = klass;
        this.linkedList = linkedList;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        linkedList.forEach(klass1 -> klass1.setListener(this));
        this.linkedList = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(1, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(1, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        String introduction = super.introduce() + " I am a Teacher. I teach ";
        if (this.linkedList.size() == 0) {
            introduction += "No Class.";
        } else {
            String klassNumbers = "";
            for (Klass klass : this.linkedList) {
                klassNumbers += klass.number + ", ";
            }
            introduction += "Class " + klassNumbers.substring(0, klassNumbers.length() - 2) + ".";
        }
        return introduction;
    }

    public String introduceWith(Student student) {
        for (Klass list : this.linkedList) {
            if (list.isIn(student)) {
                return super.introduce() + " I am a Teacher. I teach " + student.name + ".";
            } else {
                return super.introduce() + " I am a Teacher. I don't teach " + student.name + ".";
            }
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(klass, student.klass) && Objects.equals(age, student.age) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //    public String isTeaching(Student student) {
//        LinkedList<Klass> linkedList = this.getClasses();
//
//        for (Klass list : linkedList) {
//            if (list.isIn(student)) {
//                if(student.klass.leader == student)
//                {return "I am " + this.name + ". I know "+ student.name + " has joined Class 2.";}
//                else {
//                    return "I am " + this.name + ". I know "+ student.name + " become Leader of " + this.klass;
//                }
//            }
//            else return null;
//        }
//        return null;
//    }
    public boolean isTeaching(Student student) {
        LinkedList<Klass> linkedList = this.getClasses();

        for (Klass list : linkedList) {
            if (list.isIn(student)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}