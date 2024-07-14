package com.course_api.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// known as service layer and business service
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseService(CourseRepository topicRepository) {
        this.courseRepository = topicRepository;
    }

    //    private List<Topic> topics = new ArrayList<>(
    //            Arrays.asList(
    //                    new Topic("1", "Spring", "Spring Framework Description"),
    //                    new Topic("2", "Java", "Java Framework Description"),
    //                    new Topic("3", "JavaScript", "JavaScript Framework Description")
    //            )
    //    );

    public List<Course> getAllCourses(String id) {
        //return topics;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(id).forEach(courses::add);

        return courses;
    }

    public Course getSpecificCourse(String id) {
        // return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        // topics.add(topic);
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        // topics.forEach(t -> {
        //     if (t.getId().equals(id)) {
        //         t.setName(topic.getName());
        //         t.setDescription(topic.getDescription());
        //     }
        // });
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        // topics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
