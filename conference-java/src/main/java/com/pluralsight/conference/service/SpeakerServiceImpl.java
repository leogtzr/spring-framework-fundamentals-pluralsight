package com.pluralsight.conference.service;

import com.pluralsight.conference.model.Speaker;
import com.pluralsight.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(final SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl with speakerRepository parameter");
        this.speakerRepository = speakerRepository;
    }

    /* the available @Bean will be injected here.
     */
    @Autowired
    public void setSpeakerRepository(final SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl setter");
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return this.speakerRepository.findAll();
    }

}
