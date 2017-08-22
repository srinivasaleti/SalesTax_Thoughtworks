package com.tw;

public class AppTest {
    public static void main(String[] args) {
        IO consoleIO=new ConsoleIO(System.out);
        SalesTax salesTaX = new SalesTax(SalesTaxCalculator.getInstance(),new ItemTypeFactory(),consoleIO);
        salesTaX.run();
    }
}
