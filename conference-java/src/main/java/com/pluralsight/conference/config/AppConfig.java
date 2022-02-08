package com.pluralsight.conference.config;

import com.pluralsight.conference.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.conference.repository.SpeakerRepository;
import com.pluralsight.conference.service.SpeakerService;
import com.pluralsight.conference.service.SpeakerServiceImpl;
import com.pluralsight.conference.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.pluralsight.conference"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calendarFactory() {
        final CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);

        return calendarFactory;
    }

    @Bean
    public Calendar calendar() throws Exception {
        return calendarFactory().getObject();
    }

    /*
    @Bean(name = "speakerService")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(final SpeakerRepository speakerRepository) {
        // final SpeakerService speakerService = new SpeakerServiceImpl(speakerRepository());
        // ((SpeakerServiceImpl) speakerService).setSpeakerRepository(speakerRepository);
        final SpeakerService speakerService = new SpeakerServiceImpl();

        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository speakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

     */

}
