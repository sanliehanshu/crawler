package com.yrihr.crawler.entry;

import lombok.Data;

/**
 * @ClassName : QuartzBean
 * @Description :
 * @Author : ws
 * @Date: 2021-05-31 15:07
 * @Version 1.0
 */
@Data
public class QuartzBean{

    /** 任务id */
    private String  id;

    /** 任务名称 */
    private String jobName;

    /** 任务执行类 */
    private String jobClass;

    /** 任务状态 启动还是暂停*/
    private Integer status;

    /** 任务运行时间表达式 */
    private String cronExpression;
}
