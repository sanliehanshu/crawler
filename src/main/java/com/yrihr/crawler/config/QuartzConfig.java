package com.yrihr.crawler.config;

import com.yrihr.crawler.task.MyTask;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : QuartzConfig
 * @Description : https://cloud.tencent.com/developer/article/1640190
 * @Author : ws
 * @Date: 2021-05-31 11:15
 * @Version 1.0
 */
@Configuration
public class QuartzConfig {

    /**
     * 制定具体定时任务类
     * @return
     */
    @Bean
    public JobDetail updateJobDetail(){
        return JobBuilder.newJob(MyTask.class)
                .withIdentity("MyTask")
                // 持久化，默认false
                .storeDurably(true)
                .build();
    }

    @Bean
    public Trigger updateTrigger(){
        CronScheduleBuilder schedule = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(updateJobDetail())
                .withIdentity("MyTask")
                .withSchedule(schedule)
                .build();
    }
}
