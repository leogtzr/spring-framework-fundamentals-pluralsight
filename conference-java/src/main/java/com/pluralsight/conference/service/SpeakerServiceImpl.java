package com.pluralsight.conference.service;

import com.pluralsight.conference.model.Speaker;
import com.pluralsight.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    public void setSpeakerRepository(final SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return this.speakerRepository.finAll();
    }

}
