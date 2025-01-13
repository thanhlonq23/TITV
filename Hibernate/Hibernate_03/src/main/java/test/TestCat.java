package test;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import dao.Cat_DAO;
import model.cat;
import util.HibernateUtil;

public class TestCat {
	public static void main(String[] args) {
		Cat_DAO cat_DAO = new Cat_DAO();

		cat c2 = new cat();
//		c2.setId(3);
		c2.setName("Miu");
		c2.setNgaySinh(new Date(System.currentTimeMillis()));
		c2.setSex(true);

		cat_DAO.insert(c2);
//		cat_DAO.update(c2);
//		cat_DAO.delete(c2);
		
		
	}
}
