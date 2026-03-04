package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Menu;
import com.example.demo.model.Orders;
import com.example.demo.model.Wallet;
import com.example.demo.repo.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private WalletService walletService;
	
	public List<Orders> showCustomerOrders(int cid) {
		return orderRepository.findByCusId(cid);
	}
	
	public List<Orders> showCustomerPendingOrders(int cid) {
		return orderRepository.findByCusIdAndOrdStatus(1, "PENDING");
	}
	public String palceOrder(Orders order) {
		Menu menu = menuService.searchById(order.getMenId());
		double price = menu.getMenuPrice();
		double billAmount = price * order.getOrdQty();
		Wallet wallet = 
		 walletService.showCustomerWalltInfo(order.getCusId(), 
				 order.getWalSource());
		double balance = wallet.getWalAmount(); 
		double diff = balance - billAmount;
		System.out.println("Difference is  " +diff);
		if (diff < 0) {
			return "Insufficient Funds...";
		}
		order.setOrdBillAmount(billAmount);
		order.setOrdStatus("PENDING");
		orderRepository.save(order);
		wallet.setWalAmount(diff);
		walletService.updateWallet(wallet);
		return "Order Placed Successfully...";
//		return "";
	}
}
