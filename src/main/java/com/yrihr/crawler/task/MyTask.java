package com.yrihr.crawler.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @ClassName : MyTask
 * @Description :
 * @Author : ws
 * @Date: 2021-05-31 11:13
 * @Version 1.0
 */
public class MyTask extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        System.out.println("测试的定时任务："+ DateUtil.now());
    }
}
