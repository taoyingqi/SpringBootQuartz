package com.example.demo.job;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;
import java.util.Map;

public class HelloJob extends QuartzJobBean {
  
    private Logger Log = LoggerFactory.getLogger(this.getClass());
     
    @Override
    public void executeInternal(JobExecutionContext context) throws JobExecutionException {
        Log.info("Hello Job执行时间: " + new Date());
//        context.getJobDetail().getJobDataMap()
//        context.getTrigger().getJobDataMap()
        JobDataMap jobDataMap = context.getMergedJobDataMap();
//        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        for (Map.Entry entry : jobDataMap.entrySet()){
            Log.info("[{}->{}]", entry.getKey(), entry.getValue());
        }
    }
}  
