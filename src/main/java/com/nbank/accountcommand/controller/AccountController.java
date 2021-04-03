package com.nbank.accountcommand.controller;

import com.nbank.accountcommand.model.Account;
import com.nbank.accountcommand.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/create")
    private Mono<Account> createAccount(@Valid @RequestBody Account account){
        return accountService.save(account);
    }

}
