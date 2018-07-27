package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private Long repeatCount;
    private Long repeatInterval;
    private Long timesTriggered;


}
