package com.kodilla.bank.homework;

public class Bank {


    private CashMachine wroclaw;
    private CashMachine gdansk;
    private CashMachine krakow;
    private CashMachine lublin;
    private CashMachine[] banks;


    public Bank() {

        this.wroclaw= new CashMachine();
        this.gdansk = new CashMachine();
        this.krakow = new CashMachine();
        this.lublin = new CashMachine();
        CashMachine[] banks = {wroclaw, gdansk, krakow, lublin};
        this.banks = banks;
    }
    public double bilans() {
        double sum = 0;
        for (int i = 0; i < this.banks.length; i++) {
            sum += this.banks[i].saldo();
        }
        return sum;
    }

    public int operationsWithdrawal() {
        int completeSum = 0;
        for (int i = 0; i < this.banks.length; i++) {
            int sum = 0;
            for (int j = 0; j < banks[i].getValues().length; j++) {
                if (banks[i].getValues()[j] > 0) {
                } else {
                    sum++;
                    }
                }
                completeSum += sum;
        }
        return completeSum;
    }

    public int operationsAdding() {
        int completeSum = 0;
        for (int i = 0; i < this.banks.length; i++) {
            int sum = 0;
            for (int j = 0; j < banks[i].getValues().length; j++) {
                if (banks[i].getValues()[j] < 0) {
                } else {
                    sum++;
                }
            }
            completeSum += sum;
        }
        return completeSum;
    }

    public double sumWithdrawal() {
        int completeSum = 0;
        for (int i = 0; i < this.banks.length; i++) {
            int sum = 0;
            for (int j = 0; j < banks[i].getValues().length; j++) {
                if (banks[i].getValues()[j] > 0) {
                } else {
                    sum = sum + banks[i].getValues()[j];
                }
            }
            completeSum += sum;
        }
        return completeSum;
    }

    public double sumAdding() {
        int completeSum = 0;
        for (int i = 0; i < this.banks.length; i++) {
            int sum = 0;
            for (int j = 0; j < banks[i].getValues().length; j++) {
                if (banks[i].getValues()[j] < 0) {
                } else {
                    sum = sum + banks[i].getValues()[j];
                }
            }
            completeSum += sum;
        }
        return completeSum;
    }

    public CashMachine getWroclaw() {
        return wroclaw;
    }

    public void setWroclaw(CashMachine wroclaw) {
        this.wroclaw = wroclaw;
    }

    public CashMachine getGdansk() {
        return gdansk;
    }

    public void setGdansk(CashMachine gdansk) {
        this.gdansk = gdansk;
    }

    public CashMachine getKrakow() {
        return krakow;
    }

    public void setKrakow(CashMachine krakow) {
        this.krakow = krakow;
    }

    public CashMachine getLublin() {
        return lublin;
    }

    public void setLublin(CashMachine lublin) {
        this.lublin = lublin;
    }

    public CashMachine[] getBanks() {
        return banks;
    }

    public void setBanks(CashMachine[] banks) {
        this.banks = banks;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.wroclaw.operateCash(200);
        bank.gdansk.operateCash(200);
        bank.krakow.operateCash(200);
        bank.lublin.operateCash(200);
        bank.wroclaw.operateCash(-100);
        bank.lublin.operateCash(-100);
        bank.lublin.operateCash(-100);
        bank.krakow.operateCash(-100);
        bank.gdansk.operateCash(-100);
        System.out.println(bank.banks[1].getName());
        System.out.println("Bilans: " + bank.bilans());
        System.out.println("Liczba wypłat: " + bank.operationsWithdrawal());
        System.out.println("Liczba wpłat: " + bank.operationsAdding());
        System.out.println("Suma wypłat: " + bank.sumWithdrawal());
        System.out.println("Suma wpłat: " + bank.sumAdding());
    }
}