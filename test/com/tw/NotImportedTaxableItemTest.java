package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotImportedTaxableItemTest {

    private NotImportedTaxableItem notImportedTaxableItem;

    @BeforeEach
    void beforeAll() {
        notImportedTaxableItem = new NotImportedTaxableItem();
    }

    @Test
    void expectedRateOfInterestOnSalesTax() {
        assertEquals(10, notImportedTaxableItem.getRateOfSalesTax());
    }

    @Test
    void expectedRateOfInterestOnImportedItem() {
        assertEquals(0, notImportedTaxableItem.getRateOfImportedTax());
    }

}