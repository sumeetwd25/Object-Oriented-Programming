package com.demo.dao;

import java.util.List;
import com.demo.beans.Employee;

public interface EmployeeDao {
	void save(Employee e);
	
	List<Employee> getAllEmployee();

	Employee findById(int id);

	Employee findByName(String name);

	List<Employee> sortBySalary();

	List<Employee> sortByName();

	boolean updateById(int id, int newsal);

	boolean removeById(int id);
}
