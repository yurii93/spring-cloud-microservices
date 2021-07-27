package com.yuravashchenko.deposit.repository;

import com.yuravashchenko.deposit.entity.Deposit;
import org.springframework.data.repository.CrudRepository;

public interface DepositRepository extends CrudRepository<Deposit, Long> {
}
