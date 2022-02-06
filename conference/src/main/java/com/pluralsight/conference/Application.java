package com.pluralsight.conference;

import com.pluralsight.conference.service.SpeakerService;
import com.pluralsight.conference.service.SpeakerServiceImpl;

public class Application {

    public static void main(final String[] args) {
        final SpeakerService speakerService = new SpeakerServiceImpl();

        System.out.println(speakerService.findAll());
    }

}
