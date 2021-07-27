package com.yuravashchenko.bill.controller.dto;

import com.yuravashchenko.bill.entity.Bill;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@AllArgsConstructor
public class BillResponseDTO {

    private final Long billId;

    private final Long accountId;

    private final BigDecimal amount;

    private final Boolean isDefault;

    private final OffsetDateTime creationDate;

    private final Boolean overdraftEnabled;

    public BillResponseDTO(Bill bill) {
        this.billId = bill.getBillId();
        this.accountId = bill.getAccountId();
        this.amount = bill.getAmount();
        this.isDefault = bill.getIsDefault();
        this.creationDate = bill.getCreationDate();
        this.overdraftEnabled = bill.getOverdraftEnabled();
    }
}
