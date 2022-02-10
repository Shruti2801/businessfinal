package com.example.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String companyname;
    private String companylogo;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> product;

    @OneToMany(targetEntity = Service.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cs_fk",referencedColumnName = "id")
    private List<Service> service;

//    private List<String> services;

    public Student(int id, String companyname, String companylogo) {
        this.id = id;
        this.companylogo=companylogo;
        this.companyname=companyname;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public String getCompanylogo() {
        return companylogo;
    }
    public void setCompanylogo(String companylogo) {
        this.companylogo = companylogo;
    }

    public String getCompanyname() {
        return companyname;
    }
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
