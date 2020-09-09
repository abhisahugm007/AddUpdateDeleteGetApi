package com.Spring.SpringApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.SpringApi.model.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
