package com.example.demo.job;

import java.util.Date;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;   
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class HelloJob extends QuartzJobBean {
  
    private Logger Log = LoggerFactory.getLogger(this.getClass());
     
    @Override
    public void executeInternal(JobExecutionContext context) throws JobExecutionException {
        Log.error("Hello Job执行时间: " + new Date());
    }
}  
