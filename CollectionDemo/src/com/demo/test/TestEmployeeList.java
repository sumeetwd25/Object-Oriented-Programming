package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeServiceImpl();
		
		int choice = 0;
		do {
			System.out.println("\n1.Add new employee\n2.Display all employee\n3.Display by id\n4.Display by name\n5.Sort by salary\n6.Sort by name\n7.Modify salary\n8.Delete by id\n9.Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				es.addNewEmployee();
				break;
			
			case 2:
				List <Employee> list = es.displayAll();
				list.forEach(ob->{System.out.println(ob);});
				break;
				
			case 3:
				System.out.print("Enter employee id: ");
				int id = sc.nextInt();
				Employee e = es.searchById(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not found");
				}
				break;
				
			case 4:
				System.out.print("Enter employee name: ");
				String name = sc.next();
				e = es.searchByName(name);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not found");
				}
				break;
				
			case 5:
				List <Employee> list2= es.sortBySal();
				list2.forEach(a->{
					System.out.println(a);
				});
				break;
				
			case 6:
				list2 = es.sortByName();
				list2.forEach(a->{
					System.out.println(a);
				});
				break;

			case 7:
				System.out.print("Enter id: ");
				id = sc.nextInt();
				System.out.print("Enter new salary: ");
				int newsal = sc.nextInt();
				boolean status = es.modifyById(id,newsal);
				if(status) {
					System.out.println("Id:"+id+"\n"+"New salary:"+newsal);
				}
				else {
					System.out.println("Not found");
				}
				break;
				
			case 8:
				System.out.print("Enter id: ");
				id = sc.nextInt();
				status = es.deleteById(id);
				if(status) {
					System.out.println("Deleted successfully");
				}
				else {
					System.out.println("Not found");
				}
				break;
				
			case 9:
				System.out.println("Thankyou for visiting!");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}while(choice!=9);
		sc.close();
	}

}
