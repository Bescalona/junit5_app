package org.bescadev.junitapp.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Account {

    private String person;
    private BigDecimal balance;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        if (this.person == null || this.balance == null) {
            return false;
        }

        return this.person.equals(account.getPerson()) && this.balance.equals(account.getBalance());
    }
}
