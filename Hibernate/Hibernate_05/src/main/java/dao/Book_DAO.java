package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Book;
import util.HibernateUtil;

public class Book_DAO implements DAO_Interface<Book> {

	@Override
	public List<Book> selectAll() {
		List<Book> result = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "FROM Book";
				Query query = session.createQuery(hql);
				result = query.getResultList();

				tr.commit();
				session.close();
				return result;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	@Override
	public Book selectById(Book t) {
		Book result = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "FROM Book WHERE id = :id";
				Query query = session.createQuery(hql);
				query.setParameter("id", t.getId());
				List<Book> list = query.getResultList();
				result = list.get(0);

				tr.commit();
				session.close();
				return result;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public boolean insert(Book t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "INSERT INTO book(id, price, title ,author_id) "
						+ "VALUES(:id, :price ,:title , :author_id)";
				Query query = session.createSQLQuery(hql);
				query.setParameter("id", t.getId());
				query.setParameter("price", t.getPrice());
				query.setParameter("title", t.getTitle());
				query.setParameter("author_id", t.getAuthor());
				query.executeUpdate();
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean update(Book t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "UPDATE Book "
						+ "SET price = :price , title = :title , author_id = :author_id "
						+ "WHERE id = :id";
				Query query = session.createQuery(hql);
				query.setParameter("id", t.getId());
				query.setParameter("price", t.getPrice());
				query.setParameter("title", t.getTitle());
				query.setParameter("author_id", t.getAuthor());
				query.executeUpdate();
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean delete(Book t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "DELETE FROM Book "
						+ "WHERE id = :id";
				Query query = session.createQuery(hql);
				query.setParameter("id", t.getId());
				query.executeUpdate();
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
