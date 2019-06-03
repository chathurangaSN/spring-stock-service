package com.sachith.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachith.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

}
