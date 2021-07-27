package com.yuravashchenko.account.repository;

import com.yuravashchenko.account.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
