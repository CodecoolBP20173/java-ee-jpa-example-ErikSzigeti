package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Class")
public class Klass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany
    private Set<Student> students = new HashSet<>();

    public Klass() {
    }

    public Klass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
