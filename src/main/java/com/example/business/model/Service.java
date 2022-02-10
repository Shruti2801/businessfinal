package com.example.business.model;

import javax.persistence.*;

@Entity
public class Service {

    @Id
    private int id;

    private String servicename;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Service() {
    }

    public Service( int id ,String servicename) {
        this.id = id;
        this.servicename = servicename;
//        this.student = student;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
