package com.nguyenlonq23.ql_sinhvien.dao;

import com.nguyenlonq23.ql_sinhvien.entity.SinhVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class SinhVienDAOImpl implements SinhVienDAO {
    EntityManager entityManager;

    @Autowired
    public SinhVienDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<SinhVien> getAll() {
        List<SinhVien> result = entityManager.createQuery("SELECT e FROM SinhVien e", SinhVien.class).getResultList();
        return result;
    }

    @Override
    public void delete(int id) {
        SinhVien sinhVien = this.entityManager.find(SinhVien.class, id);
        entityManager.remove(sinhVien);
    }

    @Override
    public SinhVien saveAndFlush(SinhVien sinhVien) {
        sinhVien = entityManager.merge(sinhVien);
        entityManager.flush();
        return sinhVien;
    }

    @Override
    public SinhVien save(SinhVien sinhVien) {
        entityManager.persist(sinhVien);
        return sinhVien;
    }

    @Override
    public List<SinhVien> getByName(String name) {
        TypedQuery<SinhVien> query = this.entityManager.createQuery("SELECT e FROM SinhVien e WHERE e.firstName LIKE :name", SinhVien.class);
        query.setParameter("name", "%" + name + "%");
        List<SinhVien> result = query.getResultList();
        return result;
    }

    @Override
    public SinhVien getById(int id) {
        return this.entityManager.find(SinhVien.class, id);
    }
}
