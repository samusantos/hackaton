package org.academiadecodigo.loopeytunes.sqlinhas.controller;


import org.academiadecodigo.loopeytunes.sqlinhas.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RestCustomerController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping( method = RequestMethod.GET, value = {"/",""})
    public String login(){
        return "login";
    }

}
