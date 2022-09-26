package practice10;


public class Klass {
    int number;
    Student leader;

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String assignLeader(Student student) {

        if (isIn(student)) {
            this.leader = student;
        } else {

            System.out.println("It is not one of us.");
        }
        return null;


    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void appendMember(Student student) {

    }

    public boolean isIn(Student student) {
        boolean isAssign = student.klass == this ? true : false;
        return isAssign;
    }
}
