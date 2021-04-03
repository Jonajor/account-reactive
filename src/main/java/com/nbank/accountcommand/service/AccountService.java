package com.nbank.accountcommand.service;

import com.nbank.accountcommand.model.Account;
import com.nbank.accountcommand.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public Mono<Account> save(Account account) {
        return accountRepository.save(account);
    }
}
