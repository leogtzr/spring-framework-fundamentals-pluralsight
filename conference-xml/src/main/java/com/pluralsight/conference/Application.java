package com.pluralsight.conference;

import com.pluralsight.conference.service.SpeakerService;
import com.pluralsight.conference.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(final String[] args) {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        final SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);

        System.out.println(speakerService.findAll());
    }

}
