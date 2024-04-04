/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cms.cct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        db.createTableCourses("Courses");
        db.createTableStudents("Students");
        db.createTableEnrollments("Enrollments");
        db.createTableGrades("Grades"); 
        db.createTableFeedback("Feedback");

        addCoursesFromFile(db, "courses.txt");
        addStudentsFromFile(db, "students.txt");
        addEnrollmentsFromFile(db, "enrollments.txt");
        addGradesFromFile(db, "grades.txt");
        addFeedbackFromFile(db, "feedback.txt");
    }
        
    private static void addCoursesFromFile(DBConnector db, String fileName)  {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String course_code = data[0];
                String course_name = data[1];
                String program_name = data[2];
                String lecturer_name = data[3];
                String lecturer_role = data[4];
                String room = data[5];

                // Add course to the database
                db.addCourse(new Courses(course_code, course_name, program_name, lecturer_name, lecturer_role, room));
            }
        } catch (IOException |SQLException e){
            e.printStackTrace();
        }
    }
        
    private static void addStudentsFromFile(DBConnector db, String fileName)  {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String student_id  = data[0];
                String student_name  = data[1];
                String course_name  = data[2];
                String program_name  = data[3];
                

                // Add course to the database
                db.addStudent(new Students (student_id, student_name, course_name, program_name));
            }
        } catch (IOException |SQLException e){
            e.printStackTrace();
        }
    }
        
        
    private static void addEnrollmentsFromFile(DBConnector db, String fileName)  {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String enrollment_id   = data[0];
                String student_id   = data[1];
                String course_code   = data[2];
                int semester   = Integer.parseInt(data[3]);
                int grade   = Integer.parseInt(data[4]);
                

                // Add course to the database
                db.addEnrollment(new Enrollments (enrollment_id, student_id, course_code, semester, grade));
            }
        } catch (IOException |SQLException e){
            e.printStackTrace();
        }
    }
        
    private static void addGradesFromFile(DBConnector db, String fileName)  {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int grade_id  = Integer.parseInt(data[0]);
                int enrollment_id  = Integer.parseInt(data[1]);
                int grade = Integer.parseInt(data[2]);
                

                // Add course to the database
                db.addGrade (new Grades (grade_id, enrollment_id, grade));
            }
        } catch (IOException |SQLException e){
            e.printStackTrace();
        }
    }

    
    private static void addFeedbackFromFile(DBConnector db, String fileName)  {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int feedback_id   = Integer.parseInt(data[0]);
                String student_id = data[1];
                String course_code = data[2]);
                int raiting = Integer.parseInt(data[3]);

                // Add course to the database
                db.addGrade (new Feedback (feedback_id, student_id, course_code, raiting));
            }
        } catch (IOException |SQLException e){
            e.printStackTrace();
        }
    }
    } 

}