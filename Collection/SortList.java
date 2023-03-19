import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
     
        List<Student> list = new ArrayList<>();

        list.add(new Student(10,"Suresh",430));
        list.add(new Student(20,"Priti",500));
        list.add(new Student(30,"Jayashree",480));
        list.add(new Student(40,"Mohit",320));
        list.add(new Student(50,"Harsh",360));
    }
}

class Student{
    private int roll;
    private String name;
    private int marks;
    
    public Student(){
        
    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    public int getRoll() {
        return roll;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
    }
    
}
