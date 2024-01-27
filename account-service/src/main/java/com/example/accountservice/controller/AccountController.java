package com.example.accountservice.controller;

import com.example.accountservice.model.Account;
import com.example.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    @PostMapping("/addAccount")
    public ResponseEntity<Account> addAccount(){
        return new ResponseEntity<>(accountService.addAccount(), HttpStatus.CREATED);
    }
}
