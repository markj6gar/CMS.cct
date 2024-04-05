/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mark
 */
public class ReportGenerator {
    public void chooseCourseReport(List<Courses> courses) {
        System.out.println("Generating course report...");
        
        switch (format.toLowerCase()) {
            case "txt": chooseTxtCoursesReport(courses);
            break;
            case "csv": chooseCsvCoursesReport(courses);
            break;
            case "consule": chooseConsuleCoursesReport(courses);
            break;
            default: System.out.println("Invalid format");
        }
    }
    private void generateTxtCourseReport {
    try (FileWriter writer = new FileWriter("course_report.txt")) {
        for (Courses course: courses) {
            writer.write("Course name: " + course.getCourse_name() + "\n");
            writer.write("Program: " + course.getProgram_name() + "\n");
            writer.write("Lecturer: " + course.getLecturer_name() + "\n");
            writer.write("Course Room: " + course.getRoom() + "\n");
            writer.write( "--------------------------------------\n");
        }
            System.out.println("Course Report has been saved as course_report.txt");
    }   catch (IOException ex) {
            e.printStackTrace();
        }
    }
            
    private void generateCsvCourseReport {
    try (FileWriter writer = new FileWriter("course_report.csv")) {
    
    
    
    
    
    
}


 

