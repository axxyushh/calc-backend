package com.klu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArithmeticController {

    @GetMapping("/add/{A}/{B}")
    public String add(@PathVariable("A") int a, @PathVariable("B") int b) {
        return "Addition = " + (a + b);
    }
}
