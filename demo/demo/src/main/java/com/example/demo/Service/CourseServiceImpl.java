package com.example.demo.Service;

import com.example.demo.Dao.CourseDao;
import com.example.demo.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao dao;

    @Override
    public List<Course> getAllCourse() {
        return this.dao.findAll();
    }

    @Override
    public Course getCourseById(int courseId) {
        Optional<Course> c = this.dao.findById(courseId);
        Course course = null;
        if (c.isPresent()) {
            course = c.get();
        }
        else {
            throw new RuntimeException("Course not found for ID :" + courseId);
        }
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        return this.dao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return this.dao.save(course);
    }

    @Override
    public String deleteCourseById(int courseId) {
        this.dao.deleteById(courseId);
        return "deleted";
    }


}
