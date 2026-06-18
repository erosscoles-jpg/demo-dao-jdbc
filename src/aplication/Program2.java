package aplication;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== Test 1 : Seller Insert ===== ");
		Department newDep = new Department(null,"Halo");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep);
		
		System.out.println("\n=== Test 2 : Seller FindById ===== ");
		Department dep = depDao.findById(2); 
		System.out.println(dep);
		
		System.out.println("\n=== Test 2 : Seller FindById ===== ");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		
		for (Department obj: list) {
			System.out.println(obj);
		}
	}
}
