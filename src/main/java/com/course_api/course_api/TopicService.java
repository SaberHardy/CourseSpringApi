package com.course_api.course_api;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// known as service layer and business service
@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Spring", "Spring Framework Description"),
            new Topic("2", "Java", "Java Framework Description"),
            new Topic("3", "JavaScript", "JavaScript Framework Description")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
