package com.dr.learning.model;

import java.util.List;

public class Dept {
    private Integer id;
    private String dname;
    private List<Dept> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Dept> getChildren() {
        return children;
    }

    public void setChildren(List<Dept> children) {
        this.children = children;
    }

    public String toString() {
        return this.getDname();
    }
}