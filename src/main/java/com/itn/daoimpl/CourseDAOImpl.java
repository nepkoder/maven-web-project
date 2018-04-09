/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.CourseDAO;
import com.itn.modal.Course;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author newarbhai
 */

@Repository
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public void insert(Course cm) {
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cm);
        session.getTransaction().commit();
        session.close();    
    }

    @Override
    public List<Course> selectAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // data lai list ko form ma raakhney kaam garcha
        List<Course> list = session.createCriteria(Course.class).list();
        session.close();
        return list;
    }

    @Override
    public Course selectById(int id) {
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        List<Course> al = s.createCriteria(Course.class).add(Restrictions.eq("id", id)).list();
        s.close();
        return al.get(0);
    }

    @Override
    public void update(Course cm) {
        Session s = sessionFactory.openSession();
        s.beginTransaction();
    }
    
    @Override
    public void delete(int id) {
        
    }
}
