package io.github.pauloricardo.springbootstudy.service;

import io.github.pauloricardo.springbootstudy.model.Student;
import io.github.pauloricardo.springbootstudy.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;

    }

    public Student getStudentById(int id){

        return studentRepository.findById(id).orElse(null);

    }

    public Student getStudent() {

        return new Student( 1, "Paulo", 25);

    }

    public List<Student> getStudents() {

        return studentRepository.findAll();

    }

    public Student createStudent(Student student) {

        return studentRepository.save(student);
    }

}