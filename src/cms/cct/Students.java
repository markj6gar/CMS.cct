/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

/**
 *
 * @author Mark
 */
public class Students {
    String student_id; 
    String student_name;
    String course_name;
    String program_name;

    public Students(String student_id, String student_name, String course_name, String program_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.course_name = course_name;
        this.program_name = program_name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getProgram_name() {
        return program_name;
    }
    
    
}
