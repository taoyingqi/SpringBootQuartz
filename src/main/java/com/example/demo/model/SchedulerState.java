package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchedulerState {
    private String schedName;
    private String instanceName;
    private Long lastCheckinTime;
    private Long checkinInterval;

}
