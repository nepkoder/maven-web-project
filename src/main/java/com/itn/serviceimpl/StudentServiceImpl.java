/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceimpl;

import com.itn.dao.StudentDAO;
import com.itn.modal.Student;
import com.itn.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author newarbhai
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> addStudent(Student student) {
        studentDAO.insertStudent(student);
        return studentDAO.getAllStudent();
    }

    @Override
    public List<Student> getAllStudent() {
       return studentDAO.getAllStudent();
    }

    @Override
    public List<Student> getStudentById(int id) {
        return studentDAO.selectById(id);
    }

    @Override
    public List<Student> updateStudent(Student student) {
        studentDAO.updateStudent(student);
        return studentDAO.getAllStudent();
    }

    @Override
    public List<Student> deleteStudent(Student student) {
        studentDAO.deleteStudent(student);
        return studentDAO.getAllStudent();
    }

   
    
}
