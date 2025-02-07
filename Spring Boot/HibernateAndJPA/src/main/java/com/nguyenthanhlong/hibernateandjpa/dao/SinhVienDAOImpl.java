package com.nguyenthanhlong.hibernateandjpa.dao;

import com.nguyenthanhlong.hibernateandjpa.entity.SinhVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class SinhVienDAOImpl implements SinhVienDAO {
    EntityManager entityManager;

    @Autowired
    public SinhVienDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<SinhVien> getAll() {
        String jpql = "SELECT e FROM SinhVien e";
        return entityManager.createQuery(jpql, SinhVien.class).getResultList();
    }

    @Override
    public List<SinhVien> getByName(String name) {
        String jpql = "SELECT e FROM SinhVien e WHERE e.ten LIKE :t";
        TypedQuery<SinhVien> query = this.entityManager.createQuery(jpql, SinhVien.class);
        query.setParameter("t", "%" + name + "%");
        return query.getResultList();
    }

    @Override
    public SinhVien getById(int id) {
        return entityManager.find(SinhVien.class, id);
    }

    @Override
    public void save(SinhVien sinhVien) {
        entityManager.persist(sinhVien);
    }

    @Override
    public void update(SinhVien sinhVien) {
        entityManager.merge(sinhVien);
    }

    @Override
    public void updateAllEmail() {
        String jpql = "UPDATE SinhVien e SET e.email = :email";
        Query query = this.entityManager.createQuery(jpql);
        query.setParameter("email", "nguyenlonq23@gmail.com");
        query.executeUpdate();
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(SinhVien.class, id));
    }
}
