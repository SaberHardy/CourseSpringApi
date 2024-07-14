package com.course_api.course_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// known as service layer and business service
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    //    private List<Topic> topics = new ArrayList<>(
    //            Arrays.asList(
    //                    new Topic("1", "Spring", "Spring Framework Description"),
    //                    new Topic("2", "Java", "Java Framework Description"),
    //                    new Topic("3", "JavaScript", "JavaScript Framework Description")
    //            )
    //    );

    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);

        return topics;
    }

    public Topic getSpecificTopic(String id) {
        // return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        // topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        // topics.forEach(t -> {
        //     if (t.getId().equals(id)) {
        //         t.setName(topic.getName());
        //         t.setDescription(topic.getDescription());
        //     }
        // });
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        // topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
