package com.pluralsight.conference;

import com.pluralsight.conference.config.AppConfig;
import com.pluralsight.conference.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(final String[] args) {
        final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService);
        System.out.println(speakerService.findAll());

        SpeakerService speakerService2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService2);
    }

}
