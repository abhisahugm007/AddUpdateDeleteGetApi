package com.Spring.SpringApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringApi.model.Course;
import com.Spring.SpringApi.service.CourseService;

@RestController
public class helloController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "It is home App for course"; 
	}
	
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getcourses()
	{
		return this.courseService.getCourses();
	}
	
	
	//get specific Id course
	@GetMapping("/courses/{courseId}")
	public Course getcourse(@PathVariable String courseId)
	{
		return this.courseService.getcourse(Long.parseLong(courseId));
	}
	
	
	
	//Add Courses
	@PostMapping(path="/courses",consumes = "application/json")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	
	//Delete Courses
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
		try {
		this.courseService.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//update courses
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
