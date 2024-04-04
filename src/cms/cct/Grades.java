/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

/**
 *
 * @author Mark
 */
public class Grades {
    int grade_id;
    int enrollment_id;
    int grade;

    public Grades(int grade_id, int enrollment_id, int grade) {
        this.grade_id = grade_id;
        this.enrollment_id = enrollment_id;
        this.grade = grade;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public int getEnrollment_id() {
        return enrollment_id;
    }

    public int getGrade() {
        return grade;
    }

    
}
