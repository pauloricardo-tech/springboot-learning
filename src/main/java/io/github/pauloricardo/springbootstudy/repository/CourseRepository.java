package io.github.pauloricardo.springbootstudy.repository;

import io.github.pauloricardo.springbootstudy.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}