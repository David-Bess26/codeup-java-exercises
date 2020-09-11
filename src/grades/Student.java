package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public float getAverageGrade(){
        float newTotal = 0;
        for (float grade : this.grades){
            newTotal += grade;
        } return newTotal / this.grades.size();
    }
    public static void main(String[] args) {
        Student james = new Student("james");
        james.addGrade(45);
        james.addGrade(80);
        james.addGrade(65);
        System.out.println(james.getAverageGrade());
    }


}
