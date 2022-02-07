package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> finAll() {
        final List<Speaker> speakers = new ArrayList<>();

        final Speaker speaker1= new Speaker();
        speaker1.setFirstName("Leo");
        speaker1.setLastName("Gtz");

        speakers.add(speaker1);

        return speakers;
    }



}
