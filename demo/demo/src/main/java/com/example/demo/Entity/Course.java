package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_courses")
public class Course {

    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseTitle;
    private String instructorName;


    public Course() {
    }

    public Course(String courseTitle, String instructorName) {
        //this.courseId = courseId; - changed to auto generated
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
