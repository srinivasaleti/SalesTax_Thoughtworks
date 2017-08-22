package com.tw;

//Represents a item which is  imported and taxable item
public class ImportedTaxableItem implements ItemType {

    private static ImportedTaxableItem singletonInstance;

    private ImportedTaxableItem() {

    }

    static ImportedTaxableItem getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new ImportedTaxableItem();
        }
        return singletonInstance;
    }

    @Override
    public double getRateOfImportedTax() {
        return 5;
    }

    @Override
    public double getRateOfSalesTax() {
        return 10;
    }

}
