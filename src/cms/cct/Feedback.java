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
    String feedback_id;
    String student_id;
    String course_code;
    int raiting;

    public Feedback(String feedback_id, String student_id, String course_code, int raiting) {
        this.feedback_id = feedback_id;
        this.student_id = student_id;
        this.course_code = course_code;
        this.raiting = raiting;
    }

    public String getFeedback_id() {
        return feedback_id;
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
