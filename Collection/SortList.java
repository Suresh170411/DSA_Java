public class SortList {
    public static void main(String[] args) {
        
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
