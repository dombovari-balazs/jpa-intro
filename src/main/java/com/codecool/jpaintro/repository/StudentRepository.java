package com.codecool.jpaintro.repository;

import com.codecool.jpaintro.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
