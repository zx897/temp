package practice11;

public class Klass {
    int number;
    Student leader;
    Teacher listener;

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String assignLeader(Student student) {
        if (isIn(student)) {
            this.leader = student;
            if (this.listener != null){
                System.out.print("I am " + this.getListener().name + ". I know " + student.name +" become Leader of " + this.number + ".");
            }
            else return null;
        }
        else {
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

    public String appendMember(Student student) {
        student.setKlass(this);
        if (this.listener != null) {
            System.out.println("I am " + this.getListener().getName() + ". I know " + student.getName() + " has joined Class " + this.number + ".");
        }
        return null;
    }

    public boolean isIn(Student student) {
        boolean klassJudg = (student.klass == this);
        return klassJudg ? true : false;
    }

    public void setListener(Teacher teacher) {
        this.listener = teacher;
    }

    public  Teacher getListener() {
        return this.listener;
    }
}
