package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Author;
import util.HibernateUtil;

public class Author_DAO implements DAO_Interface<Author> {

	@Override
	public List<Author> selectAll() {
		List<Author> result = new ArrayList<Author>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				String hql = "FROM Author";
				Query query = session.createQuery(hql);
				result = query.getResultList();

				tr.commit();
				session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Author selectById(Author t) {
		Author result = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				String hql = "FROM Author WHERE id = :author";
				Query query = session.createQuery(hql);
				query.setParameter("author", t.getAuthor_id());

				List<Author> list = query.getResultList();
				result = list.get(0);

				tr.commit();
				session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean insert(Author t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();

				String hql = "INSERT INTO author(author_id, dateOfBirth, name) VALUES(:author, :dateOfBirth, :name)";
				Query query = session.createSQLQuery(hql);
				query.setParameter("author", t.getAuthor_id());
				query.setParameter("dateOfBirth", t.getDateOfBirth());
				query.setParameter("name", t.getName());
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
	public boolean update(Author t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "UPDATE Author "
						+ "SET dateOfBirth =: dateOfBirth, name = :name "
						+ "WHERE id = :id";
				Query query = session.createQuery(hql);
				query.setParameter("dateOfBirth", t.getDateOfBirth());
				query.setParameter("name", t.getName());
				query.setParameter("id", t.getAuthor_id());
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
	public boolean delete(Author t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "DELETE FROM author WHERE id = :id";
				Query query = session.createQuery(hql);
				query.setParameter("id", t.getAuthor_id());
				query.executeUpdate();
				
				tr.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
