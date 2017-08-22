package com.tw;

public class NotImportedTaxableItem implements ItemType {

    @Override
    public double getRateOfImportedTax() {
        return 0;
    }

    @Override
    public double getRateOfSalesTax() {
        return 10;
    }

}
