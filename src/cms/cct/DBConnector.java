package cms.cct;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mark
 */

public class DBConnector {
        private final String DB_URL = "jdbc:mysql://localhost";
        private final String USER = "admin";
        private final String PASSWORD = "java";
        
        public void createDB () throws SQLException {
            try{
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();
                stmt.execute("CREATE DATABASE CMS_cct;");
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                
        }
        }
        
        public void createTableCourses (String courses) throws SQLException {
            try{
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();
                stmt.execute("USE cms_cct");
                stmt.execute("CREATE TABLE " + courses + "(course_code varchar(10) primary key, course_name varchar(100), program_name varchar(100), lecturer_name varchar(50), lecturer_role varchar(15), room varchar(20))");
                System.out.println("Courses table sucessfully created");
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                
        }
        }
        
        public void addCourse(Courses course) throws SQLException {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            stmt.execute("USE cms_cct");
            stmt.execute(String.format("INSERT INTO Courses (course_code, course_name, program_name, lecturer_name, lecturer_role, room) VALUES ('%s', '%s', '%s', '%s' , '%s', '%s')", course.getCourse_code(), course.getCourse_name(), course.getProgram_name(), course.getLecturer_name(), course.getLecturer_role(), course.getRoom()));
            System.out.println("Courses table sucessfully created");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        
        }        
        }
        
}
