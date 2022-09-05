package com.example.UpdateDelete;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class topicController {
	@Autowired
	private TopicService topicService;
	@RequestMapping("/topics")
	public List<Topic> geAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.geTopic(id);
	}
	
	@RequestMapping(method =RequestMethod.POST,value ="/topics")
	public void addTopic(@RequestBody Topic topic) {
	topicService.add(topic);
	}
	
	@RequestMapping(method =RequestMethod.PUT,value ="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id ) {
	topicService.update(id,topic);
	}
	@RequestMapping(method =RequestMethod.DELETE,value ="/topics/{id}")
	public void Remove(@PathVariable String id) {
	topicService.remove(id);
	}
	
	
}
