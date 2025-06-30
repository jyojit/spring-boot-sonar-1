package com.example.springbootdocker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdocker.model.Department;

// Annotation
@Repository

// Interface extending CrudRepository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}