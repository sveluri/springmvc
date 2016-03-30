package com.examples.mvc.controller;

import com.examples.mvc.beans.LoginBean;
import org.springframework.stereotype.Controller;
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
    public boolean login(LoginBean loginBean){

        return false;

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {


        return "index";
    }


}
