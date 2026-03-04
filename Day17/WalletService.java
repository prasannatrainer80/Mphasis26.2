package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Wallet;
import com.example.demo.repo.WalletRepository;


@Service
public class WalletService {

	@Autowired
	private WalletRepository walletRepo;
	
	public List<Wallet> showCustomerWallet(int custId) {
		return walletRepo.findByCusId(custId);
	}
	
	public void updateWallet(Wallet wallet) {
		 walletRepo.save(wallet);
	}
	public Wallet showCustomerWalltInfo(int custId, String walType) {
		return walletRepo.findByCusIdAndWalSource(custId, walType);
	}
}
