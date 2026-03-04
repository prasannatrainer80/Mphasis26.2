package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Orders;


@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
	List<Orders> findByCusId(int cusId);
	List<Orders> findByCusIdAndOrdStatus(int cusId, String ordStatus);
}
