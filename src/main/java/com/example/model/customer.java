package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class customer {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_customer;
    @Column(name ="Username" )
    public String username_customer;
    @Column(name ="Password" )
    public  String password_customer;
    @Column(name ="FullName" )
    public  String name_customer;
    @Column(name = "Age")
    public int age_customer;
    @Column(name = "Email")
    public  String email_customer;
    @Column(name = "Mobile")
    public  String mobile_customer;
    @Column(name = "IsActive")
    public  int isActive_customer;

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getUsername_customer() {
        return username_customer;
    }

    public void setUsername_customer(String username_customer) {
        this.username_customer = username_customer;
    }

    public String getPassword_customer() {
        return password_customer;
    }

    public void setPassword_customer(String password_customer) {
        this.password_customer = password_customer;
    }

    public int getAge_customer() {
        return age_customer;
    }

    public void setAge_customer(int age_customer) {
        this.age_customer = age_customer;
    }

    public String getEmail_customer() {
        return email_customer;
    }

    public void setEmail_customer(String email_customer) {
        this.email_customer = email_customer;
    }

    public String getMobile_customer() {
        return mobile_customer;
    }

    public void setMobile_customer(String mobile_customer) {
        this.mobile_customer = mobile_customer;
    }

    public void setIsActive_customer(int isActive_customer) {
        this.isActive_customer = isActive_customer;
    }

    public int getIsActive_customer() {
        return isActive_customer;
    }

    public customer() {
    }

    public customer(String username_customer, String password_customer, String name_customer, int age_customer, String email_customer, String mobile_customer, int isActive_customer) {
        this.username_customer = username_customer;
        this.password_customer = password_customer;
        this.name_customer = name_customer;
        this.age_customer = age_customer;
        this.email_customer = email_customer;
        this.mobile_customer = mobile_customer;
        this.isActive_customer = isActive_customer;
    }
}
