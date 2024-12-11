package com.tpe.uni_onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_student03")
public class Student03 {
    @Id
    private Integer id;

    @Column(name = "student_name",nullable = false,unique = true,length = 50)//default : varchar(255)
    private String name;

    private int grade;


    //const
    public Student03() {
    }

    public Student03(int grade, String name, Integer id) {
        this.grade = grade;
        this.id = id;
        this.name = name;
    }


    //getter-setter


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student03{" +
                "grade=" + grade +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
