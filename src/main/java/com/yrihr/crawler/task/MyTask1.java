package com.yrihr.crawler.task;

import cn.hutool.core.date.DateUtil;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @ClassName : MyTask1
 * @Description :
 * @Author : ws
 * @Date: 2021-05-31 16:12
 * @Version 1.0
 */
public class MyTask1 extends QuartzJobBean {


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("动态定时任务："+ DateUtil.now());
    }
}
