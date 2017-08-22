package com.tw;

class Item {

    private final ItemType type;
    private final double price;
    private final int noOfItems;
    private final String representation;

    Item(String representation, ItemType itemType, double price, int noOfItems) {
        this.type = itemType;
        this.price = price;
        this.representation = representation;
        this.noOfItems=noOfItems;
    }

    public double getRateOfSalesTax() {
        return this.type.getRateOfSalesTax();
    }

    public double getRateOfImportedTax() {
        return this.type.getRateOfImportedTax();
    }

    double price() {
        return this.price;
    }

    int noOfItems(){
        return this.noOfItems;
    }

    String representation() {
        return this.representation;
    }

}
