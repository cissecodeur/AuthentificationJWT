package com.authentification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authentification.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
