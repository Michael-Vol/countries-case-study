package com.example.countriescasestudy.Vip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VipRepository extends JpaRepository<Vip, Integer> {
}
