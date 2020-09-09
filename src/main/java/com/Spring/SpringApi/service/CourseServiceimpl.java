package com.Spring.SpringApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringApi.dao.CourseDao;
import com.Spring.SpringApi.model.Course;

@Service
public class CourseServiceimpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	public CourseServiceimpl() {
//		list= new ArrayList<Course>();
//		list.add(new Course(110, "Java Course", "In this we cover all basics of Java and advance java with Project Devlopment"));
//		list.add(new Course(120, "Python", "Advance and core Pythone cover in this course"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getcourse(long courseId) {
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}


	@Override
		public void deleteCourse(long courseId) {
//		Course c =null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
//		int index=list.indexOf(c);
//		list.remove(index);
	
		Course entity =courseDao.getOne(courseId);
		courseDao.delete(entity);
	}


	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTital(course.getTital());
//				e.setDescription(course.getDescription());
//			}
//			
//		});
		courseDao.save(course);
		return course;
	}
	

}
