package com.springmvc;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persons {
    List<Person> p ;

    public Persons(List<Person> p) {
        this.p = p;
    }

    public List<Person> getP() {
        return p;
    }

    public void setP(List<Person> p) {
        this.p = p;
    }
}
