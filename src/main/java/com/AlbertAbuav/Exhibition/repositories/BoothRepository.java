package com.AlbertAbuav.Exhibition.repositories;

import com.AlbertAbuav.Exhibition.beans.Booth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoothRepository extends JpaRepository<Booth, Integer> {
}
