package test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Customer;
import model.MyOrder;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			Customer c1 = new Customer("001", "Long", "Lonq@gmail.com");
			MyOrder o1 = new MyOrder("1", "Yen Bai", c1);
			MyOrder o2 = new MyOrder("2", "Ha noi", c1);
			MyOrder o3 = new MyOrder("3", "Vinh Phuc", c1);
			MyOrder o4 = new MyOrder("5", "Lao cai", c1);

			List<MyOrder> list = new ArrayList<>();
			list.add(o1);
			list.add(o2);
			list.add(o3);
			list.add(o4);

			session.saveOrUpdate(c1);
			c1.setOrders(list);
			
			for (MyOrder od : list) {
				session.saveOrUpdate(od);
			}
			
//			String hql = "FROM Customer c WHERE	size(c.orders) > 0";
////			Query query = session.createQuery(hql);
//			List<Customer> result = session.createQuery(hql).list();
//			for (Customer rs : result) {
//				System.out.println(rs);
//			}
			
			tr.commit();
			session.close();

		}

	}
}