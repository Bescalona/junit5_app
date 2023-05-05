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
}
