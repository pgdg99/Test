
package main;

import test.Grade;
import test.Student;
import test.Test;
import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {
        
        Student s1= new Student(001, "Pablo", "Gonzalez");
        Student s2= new Student(002, "Juan Andres", "Ardila");
        
        Test t1= new Test(001, "SAT");
        Test t2= new Test(002, "ICFES");
        
        s1.takeTest(t1, 5);
        s1.takeTest(t2, 4);
        
        s2.takeTest(t1, 4);
        s2.takeTest(t2, 3);
        
        System.out.println(s1.getName() + "'s GPA is: " + s1.getGPA());
        System.out.println(s2.getName() + "'s GPA is: " + s2.getGPA());
    }
}
