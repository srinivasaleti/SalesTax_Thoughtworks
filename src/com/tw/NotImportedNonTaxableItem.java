package com.tw;

//Represents a item which is not imported non taxable item
public class NotImportedNonTaxableItem implements ItemType{

    private static NotImportedNonTaxableItem singletonInstance;

    private NotImportedNonTaxableItem() {

    }

    static NotImportedNonTaxableItem getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new NotImportedNonTaxableItem();
        }
        return singletonInstance;
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
