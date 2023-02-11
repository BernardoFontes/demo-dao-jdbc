package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TESTE 1: seller Find By id=====");
        Department dep = depDao.findById(2);
            System.out.println(dep);

    /*    System.out.println("\n=== TESTE 2: insert=====");
        Department depIn = new Department(null, "Shoes");
        depDao.insert(depIn);
        System.out.println("Inserted ! id: " + depIn.getId()); */


      /*  System.out.println("\n=== TESTE 4: upidate =====");
        Department depUp = depDao.findById(3);
        depUp.setName("Clothes");
        depDao.update(depUp);
        System.out.println("Updated! "); */

        System.out.println("\n=== TESTE 5: delete =====");
        System.out.println("Bote o id do que vc quer deletar: ");
        int id = sc.nextInt();

        depDao.deleteById(id);
        System.out.println("Deleted! ");

        System.out.println("\n=== TESTE 3: seller Find all =====");
        List<Department> list = depDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
    }
}