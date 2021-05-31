package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMachineTestSuite {

    @Test
    public void addCash() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.operateCash(200);
        int[] values = cashMachine.getValues();
        assertEquals(200, values[0]);
    }

    @Test
    public void withdrawalCash() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.operateCash(-200);
        int[] values = cashMachine.getValues();
        assertEquals(-200, values[0]);
    }

    @Test
    public void getValuesCheck() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.operateCash(400);
        int[] values = cashMachine.getValues();

        assertEquals(400, values[0]);
    }
    @Test
    public void checkSaldo() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.operateCash(400);
        cashMachine.operateCash(200);
        cashMachine.operateCash(-500);

        assertEquals(100, cashMachine.saldo());
    }
    @Test
    public void operationnumbersCheck() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.operateCash(400);
        cashMachine.operateCash(200);
        cashMachine.operateCash(-500);
        assertEquals(3, cashMachine.operationsNumber());
    }
}