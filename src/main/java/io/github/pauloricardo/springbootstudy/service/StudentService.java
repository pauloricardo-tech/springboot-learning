package io.github.pauloricardo.springbootstudy.service;

import io.github.pauloricardo.springbootstudy.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudentById(int id){

        return new Student( id, "Aluno " + id, 20 + id);

    }

}