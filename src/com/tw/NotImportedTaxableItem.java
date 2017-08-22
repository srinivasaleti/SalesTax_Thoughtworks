package com.tw;

//Represents a item which is not imported and a taxable item
public class NotImportedTaxableItem implements ItemType {

    private static NotImportedTaxableItem singletonInstance;

    private NotImportedTaxableItem() {

    }

    static NotImportedTaxableItem getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new NotImportedTaxableItem();
        }
        return singletonInstance;
    }

    @Override
    public double getRateOfImportedTax() {
        return 0;
    }

    @Override
    public double getRateOfSalesTax() {
        return 10;
    }

}
