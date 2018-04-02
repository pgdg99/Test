
package test;


public class Grade {
    
    private Test test;
    private double grade;

    public Grade(Test test, double grade) {
        this.test = test;
        this.grade = grade;
    }

    public Test getTest() {
        return test;
    }

    public double getGrade() {
        return grade;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
        
    
}
