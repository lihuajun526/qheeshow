package com.qheeshow.eway.web.controller;

import com.qheeshow.eway.service.model.User;
import com.qheeshow.eway.service.service.MixcomService;
import com.qheeshow.eway.service.service.UserService;
import com.qheeshow.eway.web.base.BaseController;
import com.qheeshow.eway.web.base.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by lihuajun on 16-6-14.
 */
@Controller
@RequestMapping("/auth/mixcom")
public class MixcomController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private MixcomService mixcomService;

    @RequestMapping("/bound/{userid}")
    public String bound(@PathVariable Integer userid, HttpSession session) {

        Result<String> result = new Result<>();
        result.setCode(-1);
        User user = userService.get(userid);
        if (user == null) {
            result.setMessage("此联系人不存在");
            return result.toString();
        }
        //角色：10超级管理员,11普通管理员,20创业者,30普通投资人,31认证投资人,32签约投资人
        User loginUser = (User) session.getAttribute("loginUser");
        if (loginUser.getRoleid().intValue() == 20) {//企业/创业者
            if (user.getRoleid().intValue() == 20) {//企业/创业者
                result.setMessage("您不能获得企业的联系方式");
                return result.toString();
            }
            if (loginUser.getCallTime().intValue() == 0) {
                result.setMessage("您没有购买套餐或您的通话时长已用完，请购买套餐");
                return result.toString();
            }
            if (loginUser.getCallTime().intValue() <= 2) {
                result.setMessage("您的通话时长小于2分钟，请购买套餐");
                return result.toString();
            }
        } else if (loginUser.getRoleid().intValue() >= 30 && loginUser.getRoleid().intValue() < 40) {//投资人
            if (user.getRoleid().intValue() >= 30 && user.getRoleid().intValue() < 40) {//投资人
                result.setMessage("您不能获得投资人的联系方式");
                return result.toString();
            }
            if (loginUser.getRoleid().intValue() == 30) {//未认证
                result.setMessage("请先认证投资人身份");
                return result.toString();
            }
        }
        try {
            mixcomService.bound(loginUser.getMobile(), user.getMobile(), loginUser.getCallTime());
        } catch (Exception e) {
            LOGGER.error("error", e);
            result.setMessage("获取失败");
            return result.toString();
        }
        result.setCode(0);
        return result.toString();
    }


    @RequestMapping("/receive")
    public String bound(HttpServletRequest request) {
        return null;
    }
}