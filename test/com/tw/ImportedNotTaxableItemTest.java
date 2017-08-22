package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImportedNotTaxableItemTest {

    private ImportedNotTaxableItem importedNotTaxableItem;

    @BeforeEach
    void beforeAll() {
        importedNotTaxableItem = new ImportedNotTaxableItem();
    }

    @Test
    void expectedRateOfInterestOnSalesTax() {
        assertEquals(0, importedNotTaxableItem.getRateOfSalesTax());
    }

    @Test
    void expectedRateOfInterestOnImportedItem() {
        assertEquals(5, importedNotTaxableItem.getRateOfImportedTax());
    }

}