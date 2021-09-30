package com.example.trash_api.controllers;

import org.springframework.web.bind.annotation.*;

import java.security.spec.ECField;
import java.util.Date;
import java.util.Random;

@RestController
public class TrashController {
    Random random = new Random();

    static String[] deadlySins = {"sin1", "sin2", "sin3"};

    @GetMapping("/")
    public String frontpage() {
        return "Hi";
    }

    @GetMapping("/clock")
    public Date clock() {
        return new Date();
    }

    @GetMapping("/seven-deadlysins/{sinNumber}")
    public String getDeadlySin(@PathVariable int sinNumber) {
        try {
            return deadlySins[sinNumber];
        } catch (Exception error) {
            return "not sinned";
        }
    }

    @PostMapping("/rubbish")
    public String throwOutRubbish(@RequestBody String rubbish) {
        return "mm";

    }
}


