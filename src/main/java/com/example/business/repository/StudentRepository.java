package com.example.business.repository;

import com.example.business.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
//    List<Student> findByName(String name);
}
