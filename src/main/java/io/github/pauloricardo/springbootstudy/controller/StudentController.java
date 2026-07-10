package io.github.pauloricardo.springbootstudy.controller;

import io.github.pauloricardo.springbootstudy.service.StudentService;
import io.github.pauloricardo.springbootstudy.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public Student getStudent() {

        return studentService.getStudent();

    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        return studentService.getStudents();

    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {

        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {

        return studentService.createStudent(student);

    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {

        return studentService.updateStudent(id, student);

    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id) {

        studentService.deleteStudent(id);

    }

}
