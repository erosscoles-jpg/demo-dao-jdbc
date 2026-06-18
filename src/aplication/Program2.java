package aplication;

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
		
		
	}
}
