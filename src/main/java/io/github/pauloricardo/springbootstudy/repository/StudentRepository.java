package io.github.pauloricardo.springbootstudy.repository;

import io.github.pauloricardo.springbootstudy.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
    extends JpaRepository<Student, Integer> {

}