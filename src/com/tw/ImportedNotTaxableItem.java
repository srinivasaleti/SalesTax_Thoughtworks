package com.tw;

//Represents a item which is  imported but not taxable item
public class ImportedNotTaxableItem implements ItemType {

    private static ImportedNotTaxableItem singletonInstance;

    private ImportedNotTaxableItem() {

    }

    static ImportedNotTaxableItem getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new ImportedNotTaxableItem();
        }
        return singletonInstance;
    }

    @Override
    public double getRateOfImportedTax() {
        return 5;
    }

    @Override
    public double getRateOfSalesTax() {
        return 0;
    }

}
