package com.example.demo.Controller;

import com.example.demo.Entity.Course;
import com.example.demo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WelcomeController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String welcome() {
        return "<H1>Welcome to Course Application</H1>";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getAllCourse();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        int id = Integer.parseInt(courseId);
        return this.courseService.getCourseById(id);
    }

    @PostMapping("/courses")
    public Course addNewCourse(@RequestBody Course c) {
        return this.courseService.addCourse(c);
    }

    @PutMapping(value = "/courses")
    public Course updateCourse(@RequestBody Course c) {
        return this.courseService.updateCourse(c);
    }

    @DeleteMapping("/courses/{cId}")
    public String deleteCourse(@PathVariable String cId) {
        return this.courseService.deleteCourseById(Integer.parseInt(cId));
    }
}
