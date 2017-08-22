package com.tw;

import java.util.List;

//Represents a calculator
class SalesTaxCalculator {

    private static SalesTaxCalculator singletonInstance;

    private SalesTaxCalculator() {

    }

    public static SalesTaxCalculator getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SalesTaxCalculator();
        }
        return singletonInstance;
    }

    double cost(Item item) {
        return item.price() + totalTaxOnSingleItem(item);
    }

    double totalCost(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += cost(item) * item.noOfItems();
        }
        return total;
    }

    double totalTaxOnSingleItem(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += totalTaxOnSingleItem(item) * item.noOfItems();
        }
        return total;
    }

    private double totalTaxOnSingleItem(Item item) {
        return saleTax(item) + importedDuty(item);
    }

    private double saleTax(Item item) {
        int factor = 100;
        return item.price() * item.getRateOfSalesTax() / factor;
    }

    private double importedDuty(Item item) {
        int factor = 100;
        return item.price() * item.getRateOfImportedTax() / factor;
    }

}
