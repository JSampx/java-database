package org.example.models;

import java.util.List;
import org.example.entities.Department;

public interface DepartmentDAO {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
