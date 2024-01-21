package com.springBoot.SpringBootDemo.Dao;

import com.springBoot.SpringBootDemo.Entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImpl implements  StudentDAO{

    // injecting entityManager using constructor injection
    private  EntityManager entityManager;

  @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
      super();
        this.entityManager = entityManager;
    }

    //defining field for entityManager
    //entityManger is responsible for saving and retriving entities it needs and Datasource (DB)
    //Spring automatically creates the EntityManager and DB according to the application.properties files
    // needs to autowired entityManager into DAO classes

    @Override
    @Transactional
    public void save(Student theStudent) {
            entityManager.persist(theStudent);
            // this will save the student object in DB
    }
}
