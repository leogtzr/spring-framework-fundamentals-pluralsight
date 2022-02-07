package com.pluralsight.conference.config;

import com.pluralsight.conference.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.conference.repository.SpeakerRepository;
import com.pluralsight.conference.service.SpeakerService;
import com.pluralsight.conference.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(final SpeakerRepository speakerRepository) {
        final SpeakerService speakerService = new SpeakerServiceImpl();
        ((SpeakerServiceImpl) speakerService).setSpeakerRepository(speakerRepository);

        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository speakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

}
