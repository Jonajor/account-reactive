package com.nbank.accountcommand.repository;

import com.nbank.accountcommand.model.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AccountRepository extends ReactiveCrudRepository<Account, String> {
}
