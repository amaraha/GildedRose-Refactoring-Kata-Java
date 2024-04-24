package com.gildedrose;

public class ItemUpdaterFactory {

    private final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private final static String AGE_BRIE = "Aged Brie";
    private final static String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private final static String CONJURED = "Conjured Mana Cake";


    public static ItemUpdater updaterFor(Item currentItem) {
        switch (currentItem.name) {
            case AGE_BRIE:
                return new AgedBrieItemUpdater();
            case BACKSTAGE_PASSES:
                return new BackstagePassesItemUpdater();
            case SULFURAS:
                return new SulfurasItemUpdater();
            case CONJURED:
                return new ConjuredItemUpdater();
            default:
                return new NormalItemUpdater();
        }
    }

}
