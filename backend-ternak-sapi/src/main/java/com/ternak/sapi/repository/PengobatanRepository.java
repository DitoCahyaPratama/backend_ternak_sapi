package com.ternak.sapi.repository;

import com.ternak.sapi.model.Pengobatan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PengobatanRepository extends JpaRepository<Pengobatan, String> {
    Optional<Pengobatan> findById(String idKasus);
}