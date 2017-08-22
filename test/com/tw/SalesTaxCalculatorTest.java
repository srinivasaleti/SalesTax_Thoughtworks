package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesTaxCalculatorTest {

    SalesTaxCalculator salesTaxCalculator;

    @BeforeEach
    void beforeAll() {
        this.salesTaxCalculator = SalesTaxCalculator.getInstance();
    }

    @Test
    void costOfAnItem() {
        Item bottle = new Item(ImportedTaxableItem.getInstance(), 47.50);
        assertEquals(54.625, this.salesTaxCalculator.cost(bottle));
    }

    @Test
    void totalCostOfItems() {
        Item book = new Item(NotImportedNonTaxableItem.getInstance(), 12.49);
        Item cd = new Item(NotImportedTaxableItem.getInstance(), 14.99);
        Item chocolate = new Item(NotImportedNonTaxableItem.getInstance(), 0.85);
        List<Item> items = Arrays.asList(book, cd, chocolate);

        assertEquals(29.829, salesTaxCalculator.totalCost(items));
    }

    @Test
    void totalCostOfAnotherSetOfItems() {
        Item chocolate = new Item(ImportedNotTaxableItem.getInstance(), 10.00);
        Item cd = new Item(ImportedTaxableItem.getInstance(), 47.50);
        List<Item> items = Arrays.asList(chocolate, cd);

        assertEquals(65.125, salesTaxCalculator.totalCost(items));
    }

    @Test
    void totalTaxOnItems() {
        Item chocolate = new Item(ImportedNotTaxableItem.getInstance(), 10.00);
        Item cd = new Item(ImportedTaxableItem.getInstance(), 47.50);
        List<Item> items = Arrays.asList(chocolate, cd);

        assertEquals(7.625, salesTaxCalculator.totalTaxOnSingleItem(items));
    }


    @Test
    void totalTaxOfAnotherSetOfItems() {
        Item book = new Item(NotImportedNonTaxableItem.getInstance(), 12.49);
        Item cd = new Item(NotImportedTaxableItem.getInstance(), 14.99);
        Item chocolate = new Item(NotImportedNonTaxableItem.getInstance(), 0.85);
        List<Item> items = Arrays.asList(book, cd, chocolate);

        assertEquals(1.499, salesTaxCalculator.totalTaxOnSingleItem(items));
    }

}