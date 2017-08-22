package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTypeFactoryTest {

    private ItemTypeFactory itemTypeFactory;

    @BeforeEach
    void beforeEach() {
        this.itemTypeFactory = new ItemTypeFactory();
    }

    @Test
    void expectedNonImportedNotTaxableItem() {
        assertEquals(NotImportedNonTaxableItem.class, itemTypeFactory.getItemType("book", "not import").getClass());
    }

    @Test
    void expectedImportedNotTaxableItem() {
        assertEquals(ImportedNotTaxableItem.class, itemTypeFactory.getItemType("book", "import").getClass());
    }

    @Test
    void expectedNotImportedTaxableItem() {
        assertEquals(NotImportedTaxableItem.class, itemTypeFactory.getItemType("music cd", "not import").getClass());
    }

    @Test
    void expectedImportedTaxableItem() {
        assertEquals(ImportedTaxableItem.class, itemTypeFactory.getItemType("music cd", "import").getClass());
    }

    @Test
    void expectedNullType(){
        assertEquals(NullType.class,itemTypeFactory.getItemType("xyz","xyz").getClass());
    }

}