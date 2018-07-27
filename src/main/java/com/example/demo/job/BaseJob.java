package com.example.demo.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 普通任务
 */
public interface BaseJob extends Job{
	public void execute(JobExecutionContext context) throws JobExecutionException;
}

