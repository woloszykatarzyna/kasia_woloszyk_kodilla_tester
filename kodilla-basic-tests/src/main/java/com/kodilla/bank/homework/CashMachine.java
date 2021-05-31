package com.kodilla.bank.homework;


public class CashMachine {
    private int[] values;
    private int size;



    private String name;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
    //    this.name = name;
    }

    public void operateCash(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    public double saldo() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum;
    }
    public int operationsNumber() {

        return this.values.length;
    }
    public String getName() {
        return name;
    }

//    public static void main(String[] args) {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.operateCash(100);
//        cashMachine.operateCash(500);
//        cashMachine.operateCash(-400);
//        System.out.println("Saldo: " + cashMachine.saldo());
//        System.out.println("Number of operations: " + cashMachine.operationsNumber());
//    }
}
