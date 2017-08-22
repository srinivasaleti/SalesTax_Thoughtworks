package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImportedTaxableItemTest {

    private ImportedTaxableItem importedTaxableItem;

    @BeforeEach
    void beforeAll() {
        importedTaxableItem = ImportedTaxableItem.getInstance();
    }

    @Test
    void expectedRateOfInterestOnSalesTax() {
        assertEquals(10, importedTaxableItem.getRateOfSalesTax());
    }

    @Test
    void expectedRateOfInterestOnImportedItem() {
        assertEquals(5, importedTaxableItem.getRateOfImportedTax());
    }

}