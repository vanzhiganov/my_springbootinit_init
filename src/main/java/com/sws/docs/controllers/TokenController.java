package com.sws.docs.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/token")
//@RequestHeader("Accept")
public class TokenController {
    public static final Logger logger = LoggerFactory.getLogger(TokenController.class);
    private String token;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllVersion(@RequestHeader("Token") String token) {
        logger.debug("ok");
        System.out.println("Testing listAllUsers API-----------");
//        RequestHeader.request
//        System.out.println(HttpServletRequest.request.getHeader("user-agent"));
//        HttpServletRequest.request.getHeader("user-agent");

//        Versions versions = new Versions();
//        versions.setVersions(new ArrayList<>(DB.values()));
        return token;
    }
}
