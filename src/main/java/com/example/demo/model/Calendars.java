package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
public class Calendars {
    private String schedName;
    private String calendarName;
    private Blob calendar;

}
