package com.headercont.HeaderController.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HeaderController {


    @GetMapping("/headers")
    public String displayHeaderInfo(@RequestHeader(HttpHeaders.HOST) String host)  {
        return "hostname & port: "+host;
    }

}
