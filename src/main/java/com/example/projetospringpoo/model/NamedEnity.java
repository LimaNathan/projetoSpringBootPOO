package com.example.projetospringpoo.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class NamedEnity extends BaseEnity {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
