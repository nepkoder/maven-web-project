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
public class AdminController {
    
   @RequestMapping(value={"/Admin/Home","/Admin/Dashboard"},
           method=RequestMethod.GET) 
    public String adminMain(){
        return "adminhome";
    }
}
