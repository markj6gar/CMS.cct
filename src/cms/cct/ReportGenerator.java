/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Mark
 */
class ReportGenerator {
    private void GenerateCoursesReport(List<Courses> courses, String format) throws IOException{
           System.out.println("Generating course report...");
        
        switch (format.toLowerCase()) {
            case "txt":
                generateTxtCoursesReport(courses);
                break;
            case "csv":
                generateCsvCoursesReport(courses);
                break;
            case "console":
                generateConsoleCoursesReport(courses);
                break;
            default:
                System.out.println("Invalid format");
    }    
        
    }    
    
    private void generateTxtCoursesReport (List<Courses> courses) {
    try (FileWriter writer = new FileWriter("course_report.txt")) {
        for (Courses course: courses) {
            writer.write("Course name: " + course.getCourse_name() + "\n");
            writer.write("Program: " + course.getProgram_name() + "\n");
            writer.write("Lecturer: " + course.getLecturer_name() + "\n");
            writer.write("Course Room: " + course.getRoom() + "\n");
            writer.write( "--------------------------------------\n");
        }
            System.out.println("Course Report has been saved as course_report.txt");
    }   catch (IOException e) {
            e.printStackTrace();
        }
    }
            
    private void generateCsvCoursesReport (List<Courses> courses) throws IOException {
    try (FileWriter writer = new FileWriter("course_report.csv")) {
        writer.write ("Course name, Program, Lecturer, Course, Room\n");
        for(Courses course : courses) {
            writer.write(course.getCourse_name() + "," + course.getProgram_name() + "," + course.getLecturer_name() + "," + course.getRoom() + "\n");
        }
        System.out.println("Course Report has been saved as course_report.csv");
            
        }
    }
    
     private void generateConsoleCoursesReport (List<Courses> courses) {
         System.out.println("Course report");
        for(Courses course : courses) {
            System.out.println("Course name: " + course.getCourse_name());
            System.out.println("Program: " + course.getProgram_name());
            System.out.println("Lecturer: " + course.getLecturer_name());
            System.out.println("Course Room: " + course.getRoom());
            System.out.println("-----------------------------------------");
    
    
    }
    
}
     
     
     
     

     
     
    // student report generator
    private void generateCoursesReport(List<Students> students, String format) throws IOException {
           System.out.println("Generating course report...");
        
        switch (format.toLowerCase()) {
            case "txt":
                generateTxtStudentsReport(students);
                break;
            case "csv":
                generateCsvStudentsReport(students);
                break;
            case "console":
                generateConsoleStudentsReport(students);
                break;
            default:
                System.out.println("Invalid format");
    }    
        
    }    
    
    private void generateTxtStudentsReport (List<Students> students) {
    try (FileWriter writer = new FileWriter("student_report.txt")) {
        for (Students student: students) {
            writer.write("Student name: " + student.getStudent_name() + "\n");
            writer.write("Student ID: " + student.getStudent_id() + "\n");
            writer.write("Course name: " + student.getCourse_name() + "\n");
            writer.write("Program: " + student.getProgram_name() + "\n");
        }
            System.out.println("Student Report has been saved as student_report.txt");
    }   catch (IOException e) {
            e.printStackTrace();
        }
    }
            
    private void generateCsvStudentsReport (List<Students> students) throws IOException  {
    try (FileWriter writer = new FileWriter("student_report.csv")) {
        writer.write ("Student name, Student ID, Course, Program\n");
        for(Students student : students) {
            writer.write(student.getStudent_name()+ "," + student.getStudent_id() + "," + student.getCourse_name() + "," + student.getProgram_name() +"\n");
        }
        System.out.println("Student Report has been saved as student_report.csv");
            
        }
    }
    
     private void generateConsoleStudentsReport (List<Students> students) {
         System.out.println("Student report");
        for (Students student: students) {
            System.out.println("Student name: " + student.getStudent_name() + "\n");
            System.out.println("Student ID: " + student.getStudent_id());
            System.out.println("Course name: " + student.getCourse_name());
            System.out.println("Program: " + student.getProgram_name());
            System.out.println("-----------------------------------------");
    
    
    }
    }
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
}
