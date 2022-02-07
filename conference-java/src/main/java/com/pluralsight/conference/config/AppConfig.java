package com.pluralsight.conference.config;

import com.pluralsight.conference.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.conference.repository.SpeakerRepository;
import com.pluralsight.conference.service.SpeakerService;
import com.pluralsight.conference.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(final SpeakerRepository speakerRepository) {
        final SpeakerService speakerService = new SpeakerServiceImpl(speakerRepository());
        // ((SpeakerServiceImpl) speakerService).setSpeakerRepository(speakerRepository);

        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository speakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

}
