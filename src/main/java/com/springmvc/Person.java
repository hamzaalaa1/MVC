package com.springmvc;

import java.util.List;

import jakarta.json.bind.annotation.JsonbAnnotation;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement    
public class Person {
    private String name;
    private int age;
    
    public Person(){ 

    }

    public Person(String name , int age){
        this.name = name ; 
        this.age  = age ; 
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
