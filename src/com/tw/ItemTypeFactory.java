package com.tw;

import java.util.Arrays;
import java.util.List;

public class ItemTypeFactory implements Factory {

    private List<String> nonTaxable;
    private List<String> taxable;

    ItemTypeFactory() {
        this.nonTaxable = Arrays.asList("book", "box of chocolates", "chocolate bar");
        this.taxable = Arrays.asList("music cd", "bottle of perfume");
    }

    @Override
    public ItemType getItemType(String name, String type) {
        if (hasItem(nonTaxable, name)) {
            return getNonTaxableType(type);
        }
        if (hasItem(taxable, name)) {
            return getTaxableType(type);
        }
        return NullType.getInstance();
    }

    private boolean hasItem(List<String> list, String itemName) {
        return list.stream().anyMatch(item -> item.equalsIgnoreCase(itemName));
    }

    private ItemType getNonTaxableType(String type) {
        if (type.equalsIgnoreCase("import")) {
            return ImportedNotTaxableItem.getInstance();
        }
        return NotImportedNonTaxableItem.getInstance();
    }

    private ItemType getTaxableType(String type) {
        if (type.equalsIgnoreCase("import")) {
            return ImportedTaxableItem.getInstance();
        }
        return NotImportedTaxableItem.getInstance();
    }

}
