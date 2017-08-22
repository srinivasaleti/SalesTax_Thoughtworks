package com.tw;

public class ImportedNotTaxableItem implements ItemType {

    @Override
    public double getRateOfImportedTax() {
        return 5;
    }

    @Override
    public double getRateOfSalesTax() {
        return 0;
    }

}
