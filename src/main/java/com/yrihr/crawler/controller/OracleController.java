package com.yrihr.crawler.controller;

import cn.hutool.json.JSONObject;
import com.yrihr.crawler.entry.DayHourRain;
import com.yrihr.crawler.entry.DayRain;
import com.yrihr.crawler.mapper.DayRainSiteIdMapper;
import com.yrihr.crawler.service.DayHourRainService;
import com.yrihr.crawler.service.DayRainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @ClassName : OracleController
 * @Description :
 * @Author : ws
 * @Date: 2021-06-08 15:20
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/api/oracle")
@RequiredArgsConstructor
public class OracleController {

    private final DayRainSiteIdMapper dayRainSiteIdMapper;
    private final DayRainService dayRainService;
    private final DayHourRainService dayHourRainService;

    final String url = "http://localhost:8088/api/oracle/listDayRainList";
    final String dayHourUrl = "http://localhost:8088/api/oracle/listSummaryRainList";

    @RequestMapping("/saveBatchDayPP")
    public Object saveBatchDayPP(){
        List<String> siteIdList = dayRainSiteIdMapper.siteIdList();
        for (int i = 0; i < siteIdList.size(); i++) {
            System.out.println(siteIdList.get(i));
            JSONObject json = new JSONObject();
            json.putOpt("siteId",siteIdList.get(i));
            Object[] listDayRain = new RestTemplate().postForObject(url, json, Object[].class);
            for (int j = 0; j < listDayRain.length; j++) {
                try {
                    LinkedHashMap map = (LinkedHashMap) listDayRain[j];
                    DayRain dayRain = new DayRain();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    dayRain.setTime(sdf.parse((String) map.get("time")));
                    dayRain.setSiteId((String) map.get("siteId"));
                    dayRain.setRainfall((Double) map.get("rainfall"));
                    dayRainService.saveRiver(dayRain);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return siteIdList;
    }


    @RequestMapping("/saveBatchDayHourPP")
    public Object saveBatchDayHourPP(){
        List<String> siteIdList = dayRainSiteIdMapper.siteIdDayHourList();
        for (int i = 0; i < siteIdList.size(); i++) {
            System.out.println(siteIdList.get(i));
            JSONObject json = new JSONObject();
            json.putOpt("siteId",siteIdList.get(i));
            Object[] listDayRain = new RestTemplate().postForObject(dayHourUrl, json, Object[].class);
            for (int j = 0; j < listDayRain.length; j++) {
                try {
                    LinkedHashMap map = (LinkedHashMap) listDayRain[j];
                    DayHourRain dayHourRain = new DayHourRain();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    dayHourRain.setStartTime(sdf.parse((String) map.get("startTime")));
                    dayHourRain.setEndTime(sdf.parse((String) map.get("endTime")));
                    dayHourRain.setSiteId((String) map.get("siteId"));
                    dayHourRain.setRainfall((Double) map.get("rainfall"));
                    dayHourRainService.saveRiver(dayHourRain);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return siteIdList;
    }

}
