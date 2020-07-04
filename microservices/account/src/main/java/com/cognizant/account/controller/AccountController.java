package com.cognizant.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.AccountApplication;
import com.cognizant.account.model.Account;
import com.cognizant.account.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	AccountService as;
    private Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
	@GetMapping("/{number}")
   public Account getAccount(@PathVariable int number){
	   LOGGER.info("START CONTROLLER getAccount");
	   LOGGER.info(Integer.toString(number));
	   Account account = as.getAccount(number);
	   LOGGER.info("END CONTROLLER getAccount");
	   return account;
   }
}