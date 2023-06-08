package com.demo.dao;

import java.util.List;
import java.util.ArrayList;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new Employee(1,"xxx","game designer",100000));
		elist.add(new Employee(2,"yyy","ux designer",50000));
		elist.add(new Employee(3,"zzz","analyst",80000));
	}

	@Override
	public void save(Employee e) {
		elist.add(e);	
	}

	@Override
	public List<Employee> getAllEmployee() {
		return elist;
	}

	@Override
	public Employee findById(int id) {
		for(int i=0;i<elist.size();i++) {
			if(elist.get(i).getEid()==id) {
				return elist.get(i);
			}
		}
		return null;
	}

	@Override
	public Employee findByName(String name) {
		int pos = elist.indexOf(new Employee(name));
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}

}
