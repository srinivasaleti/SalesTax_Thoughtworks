package com.tw;

class Item {

    private final ItemType type;
    private final double price;

    Item(ItemType itemType, double price) {
        this.type = itemType;
        this.price = price;
    }

    public double getRateOfSalesTax() {
        return this.type.getRateOfSalesTax();
    }

    public double getRateOfImportedTax() {
        return this.type.getRateOfImportedTax();
    }

    public double price() {
        return this.price;
    }

}
