package com.oocl.vesselweb.controller;

import com.oocl.vesselweb.service.VesselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VesselController {

    @Autowired
    private VesselService vesselService;

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello,World!";
    }
}
