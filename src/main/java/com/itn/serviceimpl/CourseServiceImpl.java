/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceimpl;

import com.itn.dao.CourseDAO;
import com.itn.modal.Course;
import com.itn.service.CourseService;
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
public class CourseServiceImpl implements CourseService {
    
    @Autowired
    CourseDAO courseDao;

    @Override
    public void addCourse(Course cm) {
        courseDao.insert(cm);
    }

    @Override
    public List<Course> getsAllCourses() {
        return courseDao.selectAll();
    }

    @Override
    public Course getById(int id) {
        return courseDao.selectById(id);
    }

    @Override
    public void updateCourse(Course cm) {
        courseDao.update(cm);
    }

    @Override
    public void deleteCourse(Course c) {
        courseDao.delete(c);
    }
    
    
    
}
