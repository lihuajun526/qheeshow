package com.qheeshow.eway.wechart.controller;

import com.qheeshow.eway.service.service.UserService;
import com.qheeshow.eway.wechart.base.BaseController;
import com.qheeshow.eway.wechart.base.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lihuajun on 16-7-6.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;
    /**
     * 完善个人信息
     *
     * @return
     */
    @RequestMapping("/appendj")
    @ResponseBody
    public String appendj() {

        Result<Map> result = new Result<>();

        Map map = new HashMap<>();
        map.put("link","/user/append.jsp");
        map.put("action","去完善");

        result.setMessage("请先完善您的个人信息");
        result.setData(map);

        return result.toString();
    }
}
