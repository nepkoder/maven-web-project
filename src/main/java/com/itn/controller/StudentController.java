/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.modal.Course;
import com.itn.modal.Student;
import com.itn.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author newarbhai
 */
@Controller
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
@RequestMapping(value="/admin/student/add", method=RequestMethod.GET)
    public String addCourse(){
        return "addstudent";
    }
    
    @RequestMapping(value="/admin/student/add", method=RequestMethod.POST)
    public String saveCourse(@ModelAttribute("students") Student std, Model theModel) {
       
        theModel.addAttribute("students",studentService.addStudent(std));
        
        return "redirect:/admin/student/display";
    }
    
    @RequestMapping(value = "/admin/student/display", method = RequestMethod.GET)
    public String displayStudent(Model model) {
        // fetch data from db
       List<Student> al =  studentService.getAllStudent();
       model.addAttribute("StudentDetails", al);
       return "displaystudent";
       
    }
    @RequestMapping(value = "/admin/student/edit/{id}", method = RequestMethod.GET)
    public String editStudent(@PathVariable("id") int id, Model model){
        List<Student> list = studentService.getStudentById(id);
        model.addAttribute("EditStudentDetails",list);
        
        return "editstudent";
    }
    
    @RequestMapping(value = {"/admin/student/edit","/admin/student/update"},method = RequestMethod.POST)
    public String updateStudent(@ModelAttribute("editStudentDetails") Student student, Model model){
        List<Student> list = studentService.updateStudent(student);
        model.addAttribute("StudentDetails",list);
        return "redirect:/admin/student/display";
    }
    
    @RequestMapping(value = "/admin/student/delete/{id}", method = RequestMethod.GET)
    public String deleteStudent(Model model, @PathVariable("id") int id){
        Student student = studentService.getStudentById(id).get(0);
        model.addAttribute("StudentDetails", studentService.deleteStudent(student));
        return "redirect:/admin/student/display";
    }
}
