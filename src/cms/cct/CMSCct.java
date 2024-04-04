/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cms.cct;

import java.sql.SQLException;



/**
 *
 * @author Mark
 */
public class CMSCct {

    /**
     * @param args the command line arguments
  
     */
    public static void main(String[] args) throws SQLException {
        DBConnector db = new DBConnector();
        // db.createDB();      
        // db.createTableCourses("Courses");
        // db.addCourse(new Courses("CSC101","Introduction to Computer Science","Computer Science","Dr. Alice Lee","Professor","A101"));
        // db.createTableStudents("Students");
        db.addStudent(new Students ("9852y","Mark Jogar","Introduction to Computer Science","Computer Science"));
        
        
       
    
    }
    
}
