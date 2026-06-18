package aplication;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao();

		System.out.println("=== Test 1: Seller findById ===== ");

		Seller seller = sellerdao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== Test 2 : Seller findByDepartament ===== ");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== Test 3 : Seller findAll ===== ");
		list = sellerdao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 4 : Seller Insert ===== ");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
		sellerdao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== Test 5 : Seller Uptade ===== ");
		seller = sellerdao.findById(1);
		seller.setName("Martha Wayne");
		sellerdao.uptade(seller);
		System.out.println("Upatade Completed");
		

	}

}
