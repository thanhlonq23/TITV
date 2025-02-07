package com.nguyenthanhlong.hibernateandjpa.configuration;

import com.nguyenthanhlong.hibernateandjpa.dao.SinhVienDAOImpl;
import com.nguyenthanhlong.hibernateandjpa.entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Scanner;

@Configuration
public class MyConfiguration {
    private final SinhVienDAOImpl sinhVienDAOImpl;
    private SinhVienDAOImpl svDAO;
    private Scanner sc;

    @Autowired
    public MyConfiguration(SinhVienDAOImpl svDAO, SinhVienDAOImpl sinhVienDAOImpl) {
        this.svDAO = svDAO;
        this.sc = new Scanner(System.in);
        this.sinhVienDAOImpl = sinhVienDAOImpl;
    }

    @Bean
    public CommandLineRunner runner() {
        return runner -> {
            menu();
        };
    }

    private void menu() {
        String choice = "1";
        while (!choice.equals("0")) {
            System.out.println("\n\n\n----------------------------MENU----------------------------");
            System.out.println("1. All Sinh Vien");
            System.out.println("2. Add Sinh Vien");
            System.out.println("3. Update Sinh Vien");
            System.out.println("4. Delete Sinh Vien");
            System.out.println("5. Find Sinh Vien by Id");
            System.out.println("6. Find Sinh Vien by Name");
            System.out.println("7. Update All Email Sinh Vien");
            System.out.println("0. Exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextLine();

            switch (choice) {
                case "0":
                    System.out.println("\nThank you!");
                case "1":
                    getAll();
                    break;
                case "2":
                    add();
                    break;
                case "3":
                    update();
                    break;
                case "4":
                    delete();
                    break;
                case "5":
                    getById();
                    break;
                case "6":
                    getByName();
                    break;
                case "7":
                    sinhVienDAOImpl.updateAllEmail();
                    break;
                default:
                    System.out.println("\nInvalid choice. Try again.");
            }

        }

    }

    private void getAll() {
        List<SinhVien> list = svDAO.getAll();
        System.out.println("Danh Sach Sinh Vien");
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }

    private void getById() {
        System.out.print("Nhap id: ");
        SinhVien sv = svDAO.getById(sc.nextInt());
        sc.nextLine();
        System.out.println(sv);
    }

    private void getByName() {
        System.out.print("Nhap ten: ");
        List<SinhVien> sinhViens = svDAO.getByName(sc.nextLine());
        sinhViens.forEach(sv -> System.out.println(sv));
    }

    private void delete() {
        System.out.print("Nhap id: ");
        svDAO.delete(sc.nextInt());
        sc.nextLine();
        System.out.print("Xoa thanh cong!!!");

    }

    private void update() {
        SinhVien sv = new SinhVien();
        System.out.print("Nhap id: ");
        sv.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ho dem: ");
        sv.setHoDem(sc.nextLine());
        System.out.print("Nhap ten: ");
        sv.setTen(sc.nextLine());
        System.out.print("Nhap email: ");
        sv.setEmail(sc.nextLine());
        svDAO.update(sv);
    }

    private void add() {
        SinhVien sv = new SinhVien();
        System.out.print("Nhap ho dem: ");
        sv.setHoDem(sc.nextLine());
        System.out.print("Nhap ten: ");
        sv.setTen(sc.nextLine());
        System.out.print("Nhap email: ");
        sv.setEmail(sc.nextLine());
        svDAO.save(sv);
    }
}
