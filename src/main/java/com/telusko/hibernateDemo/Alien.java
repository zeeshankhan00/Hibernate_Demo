package com.telusko.hibernateDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    private int age;
    @Id
    private int id;
    private String name;

    private String tech;





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
