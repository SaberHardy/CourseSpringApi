package com.course_api.course_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Spring", "Spring Framework Description"),
                new Topic("2", "Java", "Java Framework Description"),
                new Topic("3", "JavaScript", "JavaScript Framework Description")
        );
    }
}
