package model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // Đối tượng
public class cat {
	private Integer id;
	private String name;
	private Date ngaySinh;
	private Boolean sex;

	public cat() {
		super();
	}

	public cat(Integer id, String name, Date ngaySinh, Boolean sex) {
		super();
		this.id = id;
		this.name = name;
		this.ngaySinh = ngaySinh;
		this.sex = sex;
	}

	@Id // Khóa chính
	@GeneratedValue // Tự động tăng dần
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	
	

	@Override
	public String toString() {
		return "cat [id=" + id + ", name=" + name + ", ngaySinh=" + ngaySinh + ", sex=" + sex + "]";
	}

}
