package com.example.demo.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class NewJob implements BaseJob {
  
    private static Logger Log = LoggerFactory.getLogger(NewJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        Log.debug("[job group={}, New Job执行时间: {}]", context.getJobDetail().getKey().getGroup(), new Date());
    }
}  