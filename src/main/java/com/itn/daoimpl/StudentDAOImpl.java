/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.StudentDAO;
import com.itn.modal.Student;
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
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insertStudent(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Student> getAllStudent() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Student> list = session.createCriteria(Student.class).list();
        session.close();
        return list;
    }

    @Override
    public List<Student> selectById(int id) {
        Session session = sessionFactory.openSession();
       session.beginTransaction();
       List<Student> list = session.createCriteria(Student.class).add(Restrictions.eq("id", id)).list();
       session.close();
       return list;
    }

    @Override
    public void updateStudent(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteStudent(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
        session.close();
    }
    
    
    
}
