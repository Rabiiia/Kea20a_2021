package com.example.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PokemonController {

    List<String> pokemon = new ArrayList<>(){{
        add("Tiger");
        add("Lion");

    }};

    @GetMapping("/pokemon/go")
    public boolean isGo() {
        return false;
    }

    @GetMapping("/Pokemon-list")
    public List list() {
        return pokemon;

    }


}
