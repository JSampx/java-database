package org.example.models;

import org.example.db.DB;
import org.example.impl.DepartmentDAOJBC;
import org.example.impl.SellerDAOJDBC;

import java.io.IOException;
import java.sql.SQLException;

public class DAOFactory {
    public static SellerDAO createSellerDao() throws SQLException, IOException {
        return new SellerDAOJDBC(DB.getConnection());
    }
    public static DepartmentDAOJBC createDepartmentDao() throws SQLException, IOException {
        return new DepartmentDAOJBC(DB.getConnection());
    }
}
