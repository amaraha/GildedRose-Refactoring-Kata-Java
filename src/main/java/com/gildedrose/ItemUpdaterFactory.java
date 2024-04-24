package com.gildedrose;

public class ItemUpdaterFactory {

    private final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private final static String AGE_BRIE = "Aged Brie";
    private final static String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private final static String CONJURED = "Conjured";


    public static ItemUpdater updaterFor(Item currentItem) {
        ItemUpdater itemUpdater;
        if (isAgeBrieItem(currentItem.name)) {
            itemUpdater = new AgedBrieItemUpdater();
        } else if (isBackstagePassesItem(currentItem.name)) {
            itemUpdater = new BackstagePassesItemUpdater();
        } else if (isSulfurasItem(currentItem.name)) {
            itemUpdater = new SulfurasItemUpdater();
        } else if (isConjuredItem(currentItem.name)) {
            itemUpdater = new ConjuredItemUpdater();
        } else {
            itemUpdater = new NormalItemUpdater();
        }
        return itemUpdater;
    }

    private static boolean isBackstagePassesItem(String itemName) {
        return nameMatches(itemName, BACKSTAGE_PASSES);
    }

    private static boolean isAgeBrieItem(String itemName) {
        return nameMatches(itemName, AGE_BRIE);
    }

    private static boolean isSulfurasItem(String itemName) {
        return nameMatches(itemName, SULFURAS);
    }

    private static boolean isConjuredItem(String itemName) {
        return nameMatches(itemName, CONJURED);
    }

    private static boolean nameMatches(String itemName, String s) {
        return itemName != null && itemName.contains(s);
    }

}
