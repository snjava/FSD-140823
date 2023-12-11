package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
