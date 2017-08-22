package com.tw;

//Represetns a item which is not imported non taxable item
public class NotImportedNonTaxableItem implements ItemType{

    @Override
    public double getRateOfImportedTax() {
        return 0;
    }

    @Override
    public double getRateOfSalesTax() {
        return 0;
    }

}
