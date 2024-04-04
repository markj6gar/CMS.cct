/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

/**
 *
 * @author Mark
 */
public class Courses {
    String course_code; 
    String course_name;
    String program_name;
    String lecturer_name;
    String lecturer_role;
    String room;
    

    public Courses(String course_code, String course_name, String program_name, String lecturer_name, String lecturer_role, String room) {
        this.course_code = course_code;
        this.course_name = course_name;
        this.program_name = program_name;
        this.lecturer_name = lecturer_name;
        this.lecturer_role = lecturer_role;
        this.room = room;
        
    }

    public String getCourse_code() {
        return course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getProgram_name() {
        return program_name;
    }

    public String getLecturer_name() {
        return lecturer_name;
    }

    public String getLecturer_role() {
        return lecturer_role;
    }

    public String getRoom() {
        return room;
    }

   
    
   
}
