package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== Test 1 : Seller Insert ===== ");
		Department newDep = new Department(null,"Halo");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep);
		
		System.out.println("\n=== Test 2 : Seller FindById ===== ");
		Department dep = depDao.findById(2); 
		System.out.println(dep);
		
		System.out.println("\n=== Test 3 : Seller FindById ===== ");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		
		for (Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 4 : Seller Insert ===== ");
		dep = depDao.findById(1);
		dep.setName("RockStar");
		depDao.uptade(dep);
		System.out.println("Upatade Completed");
		
		System.out.println("\n=== Test 5 : Seller Insert ===== ");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}
}
