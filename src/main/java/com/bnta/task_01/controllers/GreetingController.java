package com.bnta.task_01.controllers;

import com.bnta.task_01.models.Celebration;
import com.bnta.task_01.models.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    private Greeting greeting;

    @GetMapping
    public String getGreeting(@RequestParam LocalTime time){ //http://localhost:8080/greeting?time=22:04
        greeting = new Greeting(time);
        int hour = greeting.getTimeOfDay().getHour();
        if(hour < 12 ){
            return "Good morning "+ greeting.getName();
        } else if (hour <18){
            return "Good afternoon "+ greeting.getName();
        }
        return "Good evening "+ greeting.getName();
    }

    @GetMapping("/christmas")
    public String getChristmas(){
        return new Celebration("Merry Christmas").getMessage();
    }

}
