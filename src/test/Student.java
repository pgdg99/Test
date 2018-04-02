
package test;

import java.util.ArrayList;

public class Student {
    
    private int code;
    private String name;
    private String lastName;
    private ArrayList<Grade> takenTests;

    public Student(int code, String name, String lastName) {
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        takenTests= new ArrayList();
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Grade> getTakenTests() {
        return takenTests;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTakenTests(ArrayList<Grade> takenTests) {
        this.takenTests = takenTests;
    }
  
    public void takeTest(Test test, int grade){
        Grade newTest= new Grade(test, grade);
        takenTests.add(newTest);
    }
    
    public double getGPA(){
        double GPA=0;
        for(Grade grades: takenTests){
            GPA+=grades.getGrade();
        }
        GPA=(GPA/takenTests.size());
        return GPA;
    }
}
