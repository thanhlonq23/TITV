package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.cat;
import util.HibernateUtil;

public class Cat_DAO implements DAO_Interface<cat> {

	@Override
	public List<cat> selectAll() {
		List<cat> list = new ArrayList<cat>();

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				// Thực thi câu lệnh HQL
				String hql = "FROM cat";
				Query query = session.createQuery(hql);
				list = query.getResultList();

				tr.commit();
				session.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public cat selectById(cat t) {
//		List<cat> result = new ArrayList<cat>();
		cat result = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				// B1: Thực thi câu lệnh HQL

				// Cách 1(HQL) ==> Nên dùng

//				String hql = "FROM cat c where c.id = :id";
//				Query query = session.createQuery(hql);
//				query.setParameter("id", t.getId());
//				result = query.getResultList();

				// Cách 2(Method) ==> Không nên dùng khi table có các mối quan hệ...
				// get() || find() || load
				result = session.get(cat.class, t.getId());

				// B2: Đẩy lên CSDL
				tr.commit();

				// B3: Đóng Kết nối
				session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		if (result.size() > 0) {
//			return result.get(0);
//		} else {
//			return null;
//		}

		return result;
	}

	static Scanner sc = new Scanner(System.in);

	public List<cat> selectAll_ODB() {
		List<cat> list = new ArrayList<cat>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				// Thực thi câu lệnh HQL
				System.out.print("Nhap cau lenh dieu kien: ");
				String com = sc.nextLine();
				String hql = "FROM cat c " + com;
				Query query = session.createQuery(hql);
				list = query.getResultList();

				tr.commit();
				session.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public boolean insert(cat t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				// Thực thi câu lệnh HQL

				session.save(t); // ==> Chỉ lưu khi chưa tồn tại

//				session.saveOrUpdate(t); // ==> Thêm mới khi chưa tồn tại, cập nhật DL khi đã tồn

				// Sử dụng câu câu lênh HQL trực tiếp
//				String hql = "INSERT INTO cat (id, name, ngaySinh, sex) VALUES (:id, :name, :ngaySinh, :sex)";
//				System.out.println(hql);
//				Query query = session.createSQLQuery(hql); // ==> Phải sử dụng createSQLQuery
//				query.setParameter("id", t.getId());
//				query.setParameter("name", t.getName());
//				query.setParameter("ngaySinh", t.getNgaySinh());
//				query.setParameter("sex", t.getSex());
//				query.executeUpdate();

				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(cat t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				// Thực thi câu lệnh HQL

				// Cách 1:
//				session.update(t);

				// Cách 2:
//				session.saveOrUpdate(t);

				// Cách 3:
				String hql = "UPDATE cat SET name = :name WHERE id = :id";
				Query query = session.createQuery(hql);
				query.setParameter("name", t.getName());
				query.setParameter("id", t.getId());
				query.executeUpdate();

				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(cat t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				// Thực thi câu lệnh HQL

				// Cách 1:
//				session.delete(t);

				// Cách 2:
				String hql = "DELETE FROM cat WHERE id=:id";
				Query query = session.createQuery(hql);
				query.setParameter("id", t.getId());
				query.executeUpdate();

				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
