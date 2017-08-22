package com.tw;

public class AppTest {
    public static void main(String[] args) {
        SalesTax salesTaX = new SalesTax(SalesTaxCalculator.getInstance());
        salesTaX.run();
    }
}
