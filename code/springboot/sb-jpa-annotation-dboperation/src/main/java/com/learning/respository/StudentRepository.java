package com.learning.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
