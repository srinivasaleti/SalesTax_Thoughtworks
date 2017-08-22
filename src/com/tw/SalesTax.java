package com.tw;

import java.util.Arrays;
import java.util.List;

class SalesTax {

    private SalesTaxCalculator salesTaxCalculator;
    private Factory factory;
    private IO consoleIO;

    SalesTax(SalesTaxCalculator instance, Factory factory, IO consoleIO) {
        this.salesTaxCalculator = instance;
        this.factory = factory;
        this.consoleIO = consoleIO;
    }

    void run() {
        input1();
        consoleIO.println("");
        consoleIO.println("");
        input2();
    }

    private void input1() {
        Item book = new Item("book",factory.getItemType("book", "not import"), 12.49, 1);
        Item cd = new Item("music cd",factory.getItemType("music cd", "not import"), 14.99, 1);
        Item chocolate = new Item("chocolate bar",factory.getItemType("chocolate bar", "not import"), 0.85, 1);
        List<Item> items = Arrays.asList(book, cd, chocolate);
        displayCostOfEachItem(items);
        consoleIO.println(representationFormat("Sales tax",this.salesTaxCalculator.totalTaxOnSingleItem(items)));
        consoleIO.println(representationFormat("Total cost",this.salesTaxCalculator.totalCost(items)));
    }

    private void input2(){
        Item choclates=new Item("imported box of chocolates",factory.getItemType("box of chocolates","import"),10.00,1);
        Item perfume =new Item("Imported bottle of perfume",factory.getItemType("bottle of perfume","import"),47.50,1);
        List<Item> items = Arrays.asList(choclates, perfume);
        displayCostOfEachItem(items);
        consoleIO.println(representationFormat("Sales tax",this.salesTaxCalculator.totalTaxOnSingleItem(items)));
        consoleIO.println(representationFormat("Total cost",this.salesTaxCalculator.totalCost(items)));
    }

    private void displayCostOfEachItem(List<Item> items) {
        for (Item item : items) {
            this.consoleIO.println(representationFormat(item.representation(),this.salesTaxCalculator.cost(item)));
        }
    }

    private String representationFormat(String message, double value) {
        return String.format("%-35s : %.2f",message,value);
    }

}
