package com.ttn.thmePractice.entity;

import com.ttn.thmePractice.Person;

public class UserEnum {
    String name;
    String email;
    String password;
    Person person;

    public UserEnum() {
    }

    public UserEnum(String name, String email, String password, Person person) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.person = person;
    }

    @Override
    public String toString() {
        return "UserEnum{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", person=" + person +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}