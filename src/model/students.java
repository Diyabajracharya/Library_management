package model;

public class students {
    String name;
    int grade;
    int roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public students(String name, int grade, int roll_no) {
        this.name = name;
        this.grade = grade;
        this.roll_no = roll_no;
    }
    public void students_format() {
        System.out.println("the student is "+" "+ this.name+" of class "+ this.grade+ " and has " + " books borrowed");
    }
}
