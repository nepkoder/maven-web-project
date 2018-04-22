/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author stim
 */
@Controller
public class AdminController {
    
   @RequestMapping(value={"/admin/home","/Admin/dashboard","/homepage"},
           method=RequestMethod.GET) 
    public String adminMain(){
        return "homepage";
    }
    
    @RequestMapping(value = "/admin_login", method = RequestMethod.GET)
    public String errorPage() {
        return "errorpage";
    }
    
    @RequestMapping("/login") 
    public String login() {
        return "login";
    }
//    @GetMapping("/logout")
//    public String logout() {
//        return "login";
//    }
    
       @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }
    
//    
//    @PostMapping("/Admin/login")
//    public String loginProcessing() {
//        return "adminhome";
//    }
}
