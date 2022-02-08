package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double seed;

    @Override
    public List<Speaker> findAll() {
        final List<Speaker> speakers = new ArrayList<>();

        final Speaker speaker1= new Speaker();
        speaker1.setFirstName("Leo");
        speaker1.setLastName("Gtz");

        System.out.println(this.calendar.getTime());

        speaker1.setSeedNum(this.seed);

        speakers.add(speaker1);

        return speakers;
    }



}
