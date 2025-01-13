package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.cat;
import util.HibernateUtil;

public class TestCat {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory!=null) {
				Session session = sessionFactory.openSession();
				try {
					Transaction tr = session.beginTransaction();
					cat cat1 = new cat();
					cat1.setName("Thomas");
					cat1.setSex(true);
					session.save(cat1);
					tr.commit();
				} finally {
					session.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
