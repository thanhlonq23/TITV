package com.nguyenthanhlong.hibernateandjpa.dao;

import com.nguyenthanhlong.hibernateandjpa.entity.SinhVien;
import jakarta.persistence.EntityManager;
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
        return entityManager.createQuery("from SinhVien").getResultList();
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
    public void delete(int id) {
        entityManager.remove(entityManager.find(SinhVien.class, id));
    }
}
