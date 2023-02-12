package com.developers.rest.Controller;

import com.developers.rest.Model.Account;
import com.developers.rest.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/accounts")
    public List<Account> allAccounts(){
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public Optional<Account> findById(@PathVariable("id") Long id){
        return accountRepository.findById(id);
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @PutMapping("/accounts/{id}")
    public Account updateAccount(@PathVariable Long id, @RequestBody Account account){
        return accountRepository.save(account);
    }

    @DeleteMapping("/accounts/{id}")
    public void deleteAccount(@PathVariable("id") Long id){
        accountRepository.deleteById(id);
    }



}
