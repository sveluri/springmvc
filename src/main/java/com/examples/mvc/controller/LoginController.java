package com.examples.mvc.controller;

import com.examples.mvc.beans.LoginBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 29-03-2016.
 */
@RestController
public class LoginController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean login(LoginBean loginBean){

        return false;

    }


}
