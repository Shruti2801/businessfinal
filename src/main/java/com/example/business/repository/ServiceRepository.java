package com.example.business.repository;

import com.example.business.model.Product;
import com.example.business.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,String> {
}
