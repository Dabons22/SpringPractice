package com.example.UpdateDelete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics =new ArrayList<>( Arrays.asList(new Topic("JAVA", "java For enterprise", "application"),
			new Topic("PHP", "PHP For SERVER SIDE", "SERVER application"),
			new Topic("JAVASCRIPT", "JAVASCRIPT FOR CLIENT", "CLIENT application")));


	public List<Topic>getAllTopics(){
	return topics;
	}
	
	
	public Topic geTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void add(Topic topic) {
	 topics.add(topic);
	}

	public void update(String id,Topic topic) {
	for (int i = 0; i < topics.size(); i++) {
		Topic t = topics.get(i);
		if(t.getId().equals(id)) {
			 topics.set(i, topic);
			 return;
			}
		}
	}


	public void remove(String id) {
	topics.removeIf(t -> t.getId().equals(id));	
	}
	
}
