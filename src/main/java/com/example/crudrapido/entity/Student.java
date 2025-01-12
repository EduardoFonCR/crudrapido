package com.example.crudrapido.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private  String firstName;
    private  String lastName;

    @Column(name = "email_address",unique = true )
    private  String email;

    // Getters y Setters
    public Long getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long studentId) {
        this.studentId = studentId;
    }
}
