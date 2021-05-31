package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankTestSuite {
    @Test
    public void operationsShouldBeZeroIfNoOperation() {
        Bank bank = new Bank();
        assertEquals(0, bank.operationsAdding() + bank.operationsWithdrawal());
    }

    @Test
    public void saldoShouldBeZeroIfNoOperation() {
        Bank bank = new Bank();
        assertEquals(0, bank.bilans());
    }
    @Test
    public void bilansCheckForAll() {
        Bank bank = new Bank();
        bank.getWroclaw().operateCash(200);
        bank.getGdansk().operateCash(200);
        bank.getKrakow().operateCash(200);
        bank.getLublin().operateCash(200);
        bank.getWroclaw().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getKrakow().operateCash(-100);
        bank.getGdansk().operateCash(-100);

        assertEquals(300, bank.bilans());
    }

    @Test
    public void operationNumberWithdrawalCheckForAll() {
        Bank bank = new Bank();
        bank.getWroclaw().operateCash(200);
        bank.getGdansk().operateCash(200);
        bank.getKrakow().operateCash(200);
        bank.getLublin().operateCash(200);
        bank.getWroclaw().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getKrakow().operateCash(-100);
        bank.getGdansk().operateCash(-100);

        assertEquals(5, bank.operationsWithdrawal());
    }
    @Test
    public void operationSumWithdrawalCheckForAll() {
        Bank bank = new Bank();
        bank.getWroclaw().operateCash(200);
        bank.getGdansk().operateCash(200);
        bank.getKrakow().operateCash(200);
        bank.getLublin().operateCash(200);
        bank.getWroclaw().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getKrakow().operateCash(-100);
        bank.getGdansk().operateCash(-100);

        assertEquals(-500, bank.sumWithdrawal());
    }
    @Test
    public void operationNumberAddingCheckForAll() {
        Bank bank = new Bank();
        bank.getWroclaw().operateCash(200);
        bank.getGdansk().operateCash(200);
        bank.getKrakow().operateCash(200);
        bank.getLublin().operateCash(200);
        bank.getWroclaw().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getKrakow().operateCash(-100);
        bank.getGdansk().operateCash(-100);

        assertEquals(4, bank.operationsAdding());
    }
    @Test
    public void operationSumAddingCheckForAll() {
        Bank bank = new Bank();
        bank.getWroclaw().operateCash(200);
        bank.getGdansk().operateCash(200);
        bank.getKrakow().operateCash(200);
        bank.getLublin().operateCash(200);
        bank.getWroclaw().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getLublin().operateCash(-100);
        bank.getKrakow().operateCash(-100);
        bank.getGdansk().operateCash(-100);

        assertEquals(800, bank.sumAdding());
    }

}
