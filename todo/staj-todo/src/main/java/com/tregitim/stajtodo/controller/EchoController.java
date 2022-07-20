package com.tregitim.stajtodo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class EchoController {

    @PutMapping("echo/{message}")
    public String test(@PathVariable String message, @RequestBody String text){
        return message + text;
    }
}
