package test;

import java.sql.Date;
import java.util.List;

//import java.sql.Date;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import dao.Person_DAO;
import model.Person;

import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		
		
//		Person_DAO c = new Person_DAO();

//		List<Person> ps1 = c.selectById(null)

//		for (Person person : ps1) {			
//			System.out.println(person.toString());
//		}

//		Person ps2 = new Person();
//		ps2.setId(3);
//		c.delete(ps2);

//		System.out.println(c.selectById(ps2));

//		Person ps3 = new Person(3,"Cheem", new Date(System.currentTimeMillis()), c.selectById(ps2));
//		System.out.println("Tinh trang Insert: " + c.update(ps3));

	}
}
