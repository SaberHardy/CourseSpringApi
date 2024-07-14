package com.course_api.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    // public List<Course> getAllCourses(String id);
    public List<Course> findByTopicId(String topicId);
}
