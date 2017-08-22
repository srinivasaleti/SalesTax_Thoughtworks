package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotImportedNonTaxableItemTest {

    private NotImportedNonTaxableItem notImportedNonTaxableItem;

    @BeforeEach
    void beforeAll() {
        notImportedNonTaxableItem = NotImportedNonTaxableItem.getInstance();
    }

    @Test
    void expectedRateOfInterestOnSalesTax() {
        assertEquals(0, notImportedNonTaxableItem.getRateOfSalesTax());
    }

    @Test
    void expectedRateOfInterestOnImportedItem() {
        assertEquals(0, notImportedNonTaxableItem.getRateOfImportedTax());
    }

}