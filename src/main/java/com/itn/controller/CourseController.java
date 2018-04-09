/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.modal.Course;
import com.itn.service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author stim
 */
@Controller
public class CourseController {
    
    @Autowired
    CourseService courseService;
    
    @RequestMapping(value="/admin/course/add", method=RequestMethod.GET)
    public String addCourse(){
        return "addcourse";
    }
    
    @RequestMapping(value="/admin/course/add", method=RequestMethod.POST)
    public String saveCourse(@RequestParam("ctitle") String title,
            @RequestParam("cprice") float price,
            @RequestParam("cduration") String duration){
        System.out.println(title+" "+price+" "+duration);
        // save these fields into data 
        // call service class to do dao operations using dao
        Course cm = new Course();
        cm.setTitle(title);
        cm.setPrice(price);
        cm.setDuration(duration);
        courseService.addCourse(cm);
        return "addcourse";
    }
    
    @RequestMapping(value = "/admin/course/display", method = RequestMethod.GET)
    public String xyz(Model model) {
        // fetch data from db
       List<Course> al =  courseService.getsAllCourses();
       model.addAttribute("CourseData", al);
       return "displaycourse";
    }
    @RequestMapping(value = "/admin/course/edit/{id}", method = RequestMethod.GET)
    public String editCourse(@PathVariable("id") int id, Model model) {
        Course cm = courseService.getById(id);
       
        System.out.println(cm.getId());
        System.out.println(cm.getTitle());
        model.addAttribute("course",cm);
//        System.out.println(cm.getId());
//        System.out.println(cm.getTitle());
        
        return "editcourse";
    }
}
