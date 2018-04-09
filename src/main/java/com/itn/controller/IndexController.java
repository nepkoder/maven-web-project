/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author stim
 */
@Controller
public class IndexController {
    
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String home(){
        return "adminhome";
    }
    
    @RequestMapping(value={"/aboutus","/about"}, method=RequestMethod.GET)
    public String aboutCompany(){
        return "about";
    }
}
