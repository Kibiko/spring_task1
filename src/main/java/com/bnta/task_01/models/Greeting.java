package com.bnta.task_01.models;

import java.time.LocalTime;
import java.util.Calendar;

public class Greeting {

    private String name;
    private LocalTime timeOfDay;

    public Greeting(LocalTime timeOfDay){
        this.name = "Kevin";
        this.timeOfDay = timeOfDay;
    }

    public Greeting(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(LocalTime timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
