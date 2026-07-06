package io.github.pauloricardo.springbootstudy.service;

import io.github.pauloricardo.springbootstudy.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public Student getStudentById(int id){

        return new Student( id, "Aluno " + id, 20 + id);

    }

    public Student getStudent() {

        return new Student( 1, "Paulo", 25);

    }

    public List<Student> getStudents() {

        return List.of(new Student( 1, "Paulo", 25),
                       new Student(2, "João", 26),
                       new Student(3, "Maria", 27));

    }

    public Student createStudent(Student student) {

        return student;
    }

}