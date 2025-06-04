package com.deepak.ProductRepository;

import com.deepak.productEntity.productEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepo extends JpaRepository<productEntity, Integer> {

}
