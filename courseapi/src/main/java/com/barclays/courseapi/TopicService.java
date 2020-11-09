package com.barclays.courseapi;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {
    private List<Topic> topics=Arrays.asList(
            new Topic("1","spring","spring desc"),
                new Topic("2","springboot","springboot desc"));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();

    }
}
