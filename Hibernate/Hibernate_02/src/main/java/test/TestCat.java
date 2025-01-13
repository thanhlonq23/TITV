package test;

import java.util.List;

import dao.Cat_DAO;
import model.cat;
import util.HibernateUtil;

public class TestCat {
	public static void main(String[] args) {
		Cat_DAO cat_DAO = new Cat_DAO();

//		List<cat> list = cat_DAO.selectAll();
//		System.out.println(list.isEmpty());
//		for (cat c : list) {
//			System.out.println(c);
//		}

		cat c1 = new cat();
		c1.setId(1);
		cat c2 = cat_DAO.selectById(c1);
//
		System.out.println(c2);

//		cat c3 = new cat();
//		c3.setId(7);
//		c3.setName("Lonq");
//		c3.setSex(true);
////		System.out.println("Ket qua: " + cat_DAO.insert(c3));
////		System.out.println("Ket qua: " + cat_DAO.update(c3));
//		System.out.println("Ket qua: "+cat_DAO.delete(c3));

//		List<cat> list = cat_DAO.selectAll_ODB();
//		for (cat cat : list) {
//			System.out.println(cat);
//		}
//		WHERE c.sex=true ORDER BY c.ngaySinh DESC
	}
}
