package com.mphasis.controller;

import com.mphasis.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> RetrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "LearnAWS", "Udemy"),
                new Course(2, "LearnDevOps","Whizlabs")
        );
    }
}
