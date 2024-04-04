/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

/**
 *
 * @author Mark
 */
public class Feedback {
    String enrollment_id;
    String student_id;
    String course_code;
    int raiting;

    public Feedback(String enrollment_id, String student_id, String course_code, int raiting) {
        this.enrollment_id = enrollment_id;
        this.student_id = student_id;
        this.course_code = course_code;
        this.raiting = raiting;
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

    public int getRaiting() {
        return raiting;
    }
    
    
    
}
