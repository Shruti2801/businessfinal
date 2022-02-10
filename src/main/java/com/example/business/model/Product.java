package com.example.business.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    private int id;
    private String productname;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id")
    private Student student;

    public Product() {}

    public Product( int id,String productname) {
        this.id = id;
        this.productname=productname;
//        this.student = student;
    }


    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
