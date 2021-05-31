package com.yrihr.crawler.controller;

import cn.hutool.core.util.RandomUtil;
import com.yrihr.crawler.entry.QuartzBean;
import com.yrihr.crawler.util.QuartzUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : QuartzController
 * @Description :
 * @Author : ws
 * @Date: 2021-05-31 16:13
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/api/quartz")
@RequiredArgsConstructor
public class QuartzController {

    @Autowired
    private Scheduler scheduler;

    @RequestMapping("/createJob")
    public String  createJob(QuartzBean quartzBean)  {
        try {
            //进行测试所以写死
            quartzBean.setJobClass("com.yrihr.crawler.task.MyTask1");
            quartzBean.setJobName("test1");
            quartzBean.setCronExpression("*/10 * * * * ?");
            QuartzUtils.createScheduleJob(scheduler,quartzBean);
        } catch (Exception e) {
            return "创建失败";
        }
        return "创建成功";
    }

    @RequestMapping("/pauseJob")
    public String  pauseJob()  {
        try {
            QuartzUtils.pauseScheduleJob (scheduler,"test1");
        } catch (Exception e) {
            return "暂停失败";
        }
        return "暂停成功";
    }

    @RequestMapping("/runOnce")
    public String  runOnce()  {
        try {
            QuartzUtils.runOnce (scheduler,"test1");
        } catch (Exception e) {
            return "运行一次失败";
        }
        return "运行一次成功";
    }

    @RequestMapping("/resume")
    public String  resume()  {
        try {

            QuartzUtils.resumeScheduleJob(scheduler,"test1");
        } catch (Exception e) {
            return "启动失败";
        }
        return "启动成功";
    }

    @RequestMapping("/update")
    public String  update(QuartzBean quartzBean)  {
        try {
            //进行测试所以写死
            quartzBean.setJobClass("com.yrihr.crawler.task.MyTask1");
            quartzBean.setJobName("test1");
            // 随机数 由于corn 表达式 秒只能被60整除的
            int random = RandomUtil.randomInt(1, 60);
            while (60 % random > 0) {
                System.out.println(random);
                random = RandomUtil.randomInt(1, 60);
            }
            System.out.println("最终的随机数："+random);
            quartzBean.setCronExpression("*"+"/"+random +" * * * * ?");
            QuartzUtils.updateScheduleJob(scheduler,quartzBean);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "启动失败";
        }
        return "启动成功";
    }
}
