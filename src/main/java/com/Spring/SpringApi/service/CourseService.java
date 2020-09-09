package com.Spring.SpringApi.service;

import java.util.List;

import com.Spring.SpringApi.model.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getcourse(long courseId);

	public Course addCourse(Course course);

	public void deleteCourse(long courseId);

	public Course updateCourse(Course course);
}
