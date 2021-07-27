package com.yuravashchenko.account.controller.dto;

import com.yuravashchenko.account.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class AccountResponseDTO {

    private final Long accountId;

    private final String name;

    private final String email;

    private final String phone;

    private final OffsetDateTime creationDate;

    private final List<Long> bills;

    public AccountResponseDTO(Account account) {
        this.accountId = account.getAccountId();
        this.name = account.getName();
        this.email = account.getEmail();
        this.phone = account.getPhone();
        this.creationDate = account.getCreationDate();
        this.bills = account.getBills();
    }
}
