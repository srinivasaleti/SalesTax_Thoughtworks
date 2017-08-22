package com.tw;

public class NullType implements ItemType {
    private static ItemType instance;

    private NullType() {

    }

    public static ItemType getInstance() {
        if (instance == null) {
            instance = new NullType();
        }
        return instance;
    }

    @Override
    public double getRateOfImportedTax() {
        return 0;
    }

    @Override
    public double getRateOfSalesTax() {
        return 0;
    }

}
