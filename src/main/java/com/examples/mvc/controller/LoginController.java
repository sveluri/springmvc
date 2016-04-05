package com.examples.mvc.controller;

import com.examples.mvc.beans.LoginBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Admin on 29-03-2016.
 */
@Controller
public class LoginController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("login") LoginBean loginBean) {

        System.out.println("login method" + loginBean);

        if ("admin".equals(loginBean.getUsername()) && "admin".equals(loginBean.getPassword())) {

            return "loginprocess";
        } else {
            return "index";
        }

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {


        return "index";
    }


}
