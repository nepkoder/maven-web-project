/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.dao;

import com.itn.modal.Student;
import java.util.List;

/**
 *
 * @author newarbhai
 */
public interface StudentDAO {
    
    void insertStudent(Student student);
    
    List<Student> getAllStudent();
    
    List<Student> selectById(int id);
    
//    List<Student> selectByName(String name);
    
    void updateStudent(Student student);
    
    void deleteStudent(Student student);
    
}
