package org.example.impl;

import java.sql.Connection;

public class DepartmentDAOJBC {
    private Connection conn;
    public DepartmentDAOJBC(Connection conn) {
        this.conn = conn;
    }

    public DepartmentDAOJBC() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
