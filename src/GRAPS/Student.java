/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GRAPS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Amil
 */
public class Student {
    private String studentName;
    void addStudent(){
        System.out.println("Add Student");
    }
   void findDefaultersList(){
        ArrayList<String> StudentList = new ArrayList();
        StudentList.add(studentName);
    }
    public static void main(String[] args) {
        Student s= new Student();
        s.addStudent();
        s.studentName="ram";
        s.findDefaultersList();      
    }
}
