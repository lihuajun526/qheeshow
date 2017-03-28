package com.qheeshow.eway.backstage.controller;

import com.alibaba.fastjson.JSON;
import com.qheeshow.eway.backstage.base.BaseController;
import com.qheeshow.eway.backstage.base.Result;
import com.qheeshow.eway.backstage.base.ResultDg;
import com.qheeshow.eway.service.model.Activity;
import com.qheeshow.eway.service.service.ActivityService;
import com.qheeshow.eway.service.service.ActivitySignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by lihuajun on 16-6-14.
 */
@Controller
@RequestMapping("/activity")
public class ActivityController extends BaseController {

    @Autowired
    private ActivityService activityService;
    @Autowired
    private ActivitySignService activitySignService;

    @RequestMapping("/list/{activityClass}")
    @ResponseBody
    public String list(@PathVariable Integer activityClass) {

        ResultDg<List<Activity>> resultDg = new ResultDg<>();

        Activity activity = new Activity();
        activity.setActivityClass(activityClass);
        List<Activity> list = activityService.listByClass(activityClass);
        resultDg.setTotal(list.size());
        resultDg.setRows(list);

        return JSON.toJSONString(resultDg);
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public String get(@PathVariable Integer id) {

        Result<Activity> result = new Result();
        Activity activity = activityService.get(id);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        activity.setsBeginTime(sdf.format(activity.getBeginTime()));
        activity.setsEndTime(sdf.format(activity.getEndTime()));
        activity.setsSignEndTime(sdf.format(activity.getSignEndTime()));

        result.setData(activity);
        return result.toString();
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(Activity activity) throws ParseException {

        Result<Boolean> result = new Result();
        result.setData(false);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        activity.setBeginTime(sdf.parse(activity.getsBeginTime()));
        activity.setEndTime(sdf.parse(activity.getsEndTime()));
        activity.setSignEndTime(sdf.parse(activity.getsSignEndTime()));
        activityService.save(activity);

        result.setData(true);
        return result.toString();
    }

    @RequestMapping("/status/update/{activityid}/{status}")
    @ResponseBody
    public String updateStatus(@PathVariable Integer activityid, @PathVariable Integer status) throws ParseException {

        Result<Boolean> result = new Result();
        result.setData(false);

        Activity activity = new Activity();
        activity.setId(activityid);
        activity.setDocStatus(status);
        activityService.save(activity);

        result.setData(true);
        return result.toString();
    }

    @RequestMapping("/head/{activityid}/{ishead}")
    @ResponseBody
    public String head(@PathVariable Integer activityid, @PathVariable Integer ishead) throws ParseException {

        Result<Boolean> result = new Result();
        result.setData(false);

        Activity activity = new Activity();
        activity.setId(activityid);
        activity.setIsHead(ishead);
        activityService.save(activity);

        result.setData(true);
        return result.toString();
    }
}