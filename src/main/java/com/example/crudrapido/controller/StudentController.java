package com.example.crudrapido.controller;


import com.example.crudrapido.entity.Student;
import com.example.crudrapido.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }

    // Crear un nuevo estudiante
    @PostMapping
    public void saveStudent(@RequestBody Student student) {
        studentService.saveOrUpdate(student); // Llama al metodo para crear
    }

    @PutMapping("/{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId, @RequestBody Student student) {
        student.setId(studentId); // Asegurarse de que el ID se actualiza correctamente
        studentService.saveOrUpdate(student); // Llama al metodo para actualizar
    }

    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }
}
