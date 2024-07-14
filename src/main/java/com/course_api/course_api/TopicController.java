package com.course_api.course_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    //    @RequestMapping("/topics/{foo}")
    //    public Topic getSpecificTopic(@PathVariable("foo") String id) {

    @RequestMapping("/topics/{id}")
    public Topic getSpecificTopic(@PathVariable String id) {
        return topicService.getSpecificTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(value="/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }
}
