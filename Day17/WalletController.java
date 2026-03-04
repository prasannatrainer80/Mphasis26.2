package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Wallet;
import com.example.demo.service.WalletService;


@RestController
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@GetMapping(value="/showWallets/{custId}")
	public List<Wallet> showWallet(@PathVariable int custId) {
		return walletService.showCustomerWallet(custId);
	}
	
	@GetMapping(value="/showWalletInfo/{custId}/{walType}")
	public Wallet showWalletInfo(@PathVariable int custId,
				@PathVariable String walType
			) {
		return walletService.showCustomerWalltInfo(custId, walType);
	}
}
