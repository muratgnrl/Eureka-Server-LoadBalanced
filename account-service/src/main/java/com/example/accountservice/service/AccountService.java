package com.example.accountservice.service;

import com.example.accountservice.model.Account;
import com.example.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final RestTemplate restTemplate;


    private static final String URL = "http://NAME-SERVICE/name/getName";
    public Account addAccount() {
        String name =restTemplate.getForObject(URL,String.class);
        Account account=Account.builder()
                .name(name)
                .build();
        return accountRepository.save(account);
    }
}