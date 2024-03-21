package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll() {
		
		List<Department> list = new ArrayList<>();
		
		list.add(new Department(1, "Departamento One"));
		list.add(new Department(2, "Departamento Two"));
		list.add(new Department(3, "Departamento Three"));
		list.add(new Department(4, "Departamento Four"));
		list.add(new Department(5, "Departamento Five"));
		
		return list;
	}
}
