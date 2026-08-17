package io.github.pauloricardo.springbootstudy.service;

import io.github.pauloricardo.springbootstudy.dto.StudentRequestDTO;
import io.github.pauloricardo.springbootstudy.dto.StudentResponseDTO;
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

    public StudentResponseDTO getStudentById(int id){

        Student student = studentRepository.findById(id).orElse(null);

        if (student == null){
            return null;
        }

        return new StudentResponseDTO(

                student.getId(),
                student.getName(),
                student.getAge());

    }

    public Student getStudent() {

        return new Student( 1, "Paulo", 25);

    }

    public List<StudentResponseDTO> getStudents() {

        return studentRepository.findAll().stream().map(student -> new StudentResponseDTO(student.getId(), student.getName(), student.getAge())).toList();

    }

    public StudentResponseDTO createStudent(StudentRequestDTO studentRequestDTO) {

        Student student = new Student();

        student.setName(studentRequestDTO.getName());
        student.setAge(studentRequestDTO.getAge());

        Student savedStudent = studentRepository.save(student);

        return new StudentResponseDTO(savedStudent.getId(), savedStudent.getName(), savedStudent.getAge());
    }

    public StudentResponseDTO updateStudent(int id, StudentRequestDTO studentRequestDTO) {

        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return null;
        }

        existingStudent.setName(studentRequestDTO.getName());
        existingStudent.setAge(studentRequestDTO.getAge());

        Student updatedStudent = studentRepository.save(existingStudent);

        return new StudentResponseDTO(updatedStudent.getId(), updatedStudent.getName(), updatedStudent.getAge());

    }

    public void deleteStudent(int id) {

        studentRepository.deleteById(id);

    }

}