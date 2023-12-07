package org.bescadev.junitapp.example.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testAccountName() {
        Account account = new Account("Bastian", new BigDecimal("1000.12345"));
        String expected = "Bastian";
        String real = account.getPerson();
        assertEquals(expected, real);
        assertTrue(real.equals("Bastian"));
    }

    @Test
    void testAccountBalance() {
        Account account = new Account("Bastian", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, account.getBalance().doubleValue());
        assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    void testAccountReference() {
        Account account = new Account("Jhon Doe", new BigDecimal("8900.9997"));
        Account account2 = new Account("Jhon Doe", new BigDecimal("8900.9997"));

        //assertNotEquals(account2, account);
        assertEquals(account2, account);
    }
}