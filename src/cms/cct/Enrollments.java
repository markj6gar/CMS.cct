/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

/**
 *
 * @author Mark
 */
public class Enrollments {
    String enrollment_id;
    String student_id;
    String course_code;
   

    public Enrollments(String enrollment_id, String student_id, String course_code) {
        this.enrollment_id = enrollment_id;
        this.student_id = student_id;
        this.course_code = course_code;
       
    }

    public String getEnrollment_id() {
        return enrollment_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getCourse_code() {
        return course_code;
    }


    
    
    
    
}
