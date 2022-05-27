package com.AlbertAbuav.Exhibition.repositories;

import com.AlbertAbuav.Exhibition.beans.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
