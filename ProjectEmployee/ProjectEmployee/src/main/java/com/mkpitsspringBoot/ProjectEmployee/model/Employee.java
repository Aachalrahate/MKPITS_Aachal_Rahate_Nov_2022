package com.mkpitsspringBoot.ProjectEmployee.model;

import javax.persistence.*;

@Entity

@Table(name= "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "address")
    private String address;

//    @Column(name = "dob")
//    private date dob;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getMobile(){
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public String getAddress(){
        return address;
    }
    public void  setAddress(String address){
        this.address = address;
    }

//public date getDob(){
//        return dob;
//}
//public void setDob(date dob){
//        this.dob = dob;
//}
}
