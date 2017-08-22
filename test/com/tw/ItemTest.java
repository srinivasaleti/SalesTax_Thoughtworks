package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ItemTest {

    private Item item;
    private ItemType itemType;

    @BeforeEach
    void before() {
        this.itemType = mock(ItemType.class);
        this.item = new Item(this.itemType, 10);
    }

    @Test
    void expectedPriceOfItem() {
        assertEquals(10, this.item.price());
    }

    @Test
    void expectedSalesTaxInterest() {
        this.item.getRateOfSalesTax();

        verify(this.itemType).getRateOfSalesTax();
    }

    @Test
    void expectedInterestOnImportedDuty() {
        this.item.getRateOfImportedTax();

        verify(this.itemType).getRateOfImportedTax();
    }

}