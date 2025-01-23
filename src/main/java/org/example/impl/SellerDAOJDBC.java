package org.example.impl;

import org.example.db.DbException;
import org.example.entities.Department;
import org.example.entities.Seller;
import org.example.models.SellerDAO;
import org.example.db.DB;

import java.sql.*;
import java.util.List;

public class SellerDAOJDBC implements SellerDAO {
    private Connection conn;

    public SellerDAOJDBC(Connection conn){
        this.conn = conn;
    }


    @Override
    public void insert(Seller obj) throws SQLException {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());
            st.setString(2, obj.getEmail());
            st.setDate(1, new java.sql.Date(obj.getBirthDate().getTime()));
            st.setString(1, obj.getName());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()){
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
            }else {
                throw new DbException("Unexpected error! No rows affected");
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }

    @Override
    public List<Department> findByDepartment() {
        return List.of();
    }
}
