package test;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.Author_DAO;
import dao.Book_DAO;
import model.Author;
import model.Book;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		Author_DAO au = new Author_DAO();
		Book_DAO b = new Book_DAO();
		Author author_1 = new Author("001", "Nguyen Nhat Anh", new Date(System.currentTimeMillis()));
		Author author_2 = new Author("002", "Nguyen Nhat Tung", new Date(System.currentTimeMillis()));
		Author author_3 = new Author("003", "Nguyen Thanh Long", new Date(System.currentTimeMillis()));
		Book book_1 = new Book("B04", "Tôi Thấy Hoa Vàng Trên TOi", 200000, author_1);
		Book book_2 = new Book("B05", "Tôi là Bêtô", 150000, author_1);
		Book book_3 = new Book("B06", "Cô gái đến từ hôm qua", 100000, author_1);
		Book book_0 = new Book("B03", null, 100000, null);

		System.out.println(b.delete(book_1));

	}
}
