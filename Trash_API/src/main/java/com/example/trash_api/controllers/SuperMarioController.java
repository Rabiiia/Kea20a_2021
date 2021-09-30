package com.example.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SuperMarioController {
    Random random = new Random();


    @GetMapping ("/supermario/character")
    public String getCharacter() {
        return "shy Guy";
    }
}
