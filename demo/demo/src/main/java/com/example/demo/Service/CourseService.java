package com.example.demo.Service;

import com.example.demo.Entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getAllCourse();
    public Course getCourseById(int courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public String deleteCourseById(int courseId);

}
