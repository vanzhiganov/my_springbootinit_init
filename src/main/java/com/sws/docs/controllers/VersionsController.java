package com.sws.docs.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sws.docs.models.Version;
import com.sws.docs.models.Versions;

@RestController
@RequestMapping("")
public class VersionsController {
    public static final Logger logger = LoggerFactory.getLogger(VersionsController.class);

    private static Map<Integer, Version> DB = new HashMap<>();


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Versions getAllVersion() {
        logger.debug("ok");
        Versions versions = new Versions();
        versions.setVersions(new ArrayList<>(DB.values()));
        return versions;
    }

    static
    {
        Version user1 = new Version();
        user1.setId(1);
        user1.setVersion("v1");
        user1.setUri("/v1");

        Version user2 = new Version();
        user2.setId(2);
        user2.setVersion("Harry");
        user2.setUri("/v2");

        DB.put(user1.getId(), user1);
        DB.put(user2.getId(), user2);
    }
}