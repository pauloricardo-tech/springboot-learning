package io.github.pauloricardo.springbootstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {

        return new Student( 1, "Paulo", 25);

    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        return List.of (new Student( 1, "Paulo", 23),
                        new Student( 2, "João", 26),
                        new Student( 3, "Carlos", 27));
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {

        return new Student(id, "Aluno " + id, 20 + id);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return student;
    }

}
