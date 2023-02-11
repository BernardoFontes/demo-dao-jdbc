package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TESTE 1: seller Find by id =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TESTE 2: seller Find by department =====");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: seller Find all =====");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

       /* System.out.println("\n=== TESTE 4: seller Insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gregorio.com", new Date(), 8000.000, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! id: " + newSeller.getId());


        System.out.println("\n=== TESTE 5: seller Upidate =====");
        seller = sellerDao.findById(3);
        seller.setName("Xuana Silva");
        sellerDao.update(seller);
        System.out.println(seller.getName());

        System.out.println("\n=== TESTE 6: seller Delete =====");
        sellerDao.deleteById(12);
        System.out.println("Deleted!");

         System.out.println("\n=== TESTE 7: seller Delete com scanner =====");
        System.out.println("Enter id for delete: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deleted!");
        */

        System.out.println("\n=== TESTE 5: seller Upidate =====");
        seller = sellerDao.findById(3);
        seller.setEmail("xua@gmail.com");
        sellerDao.update(seller);
        System.out.println(seller.getEmail());

    }
}