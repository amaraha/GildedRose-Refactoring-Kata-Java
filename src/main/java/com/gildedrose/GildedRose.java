package com.gildedrose;

class GildedRose {

    public static final int HIGHEST_QUALITY = 50;
    public static final int LOWEST_QUALITY = 0;

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item currentItem : items) {
            switch (currentItem.name) {
                case "Aged Brie":
                    updateAgedBrieQuality(currentItem);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePassesQuality(currentItem);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    updateCommonItemQuality(currentItem);
                    break;
            }
        }

    }

    private void updateCommonItemQuality(Item currentItem) {
        if (currentItem.quality > 0) {
            decreaseQuality(currentItem);
        }
        decreaseSellIn(currentItem);
        if (passedSellIn(currentItem)) {
            decreaseQuality(currentItem);
        }
    }

    private void updateAgedBrieQuality(Item currentItem) {
        increaseQuality(currentItem);
        decreaseSellIn(currentItem);
        if (passedSellIn(currentItem)) {
            increaseQuality(currentItem);
        }
    }

    private void updateBackstagePassesQuality(Item currentItem) {
        increaseQuality(currentItem);
        if (currentItem.sellIn < 11) {
            increaseQuality(currentItem);
        }
        if (currentItem.sellIn < 6) {
            increaseQuality(currentItem);
        }
        decreaseSellIn(currentItem);
        if (passedSellIn(currentItem)) {
            currentItem.quality = 0;
        }
    }

    private boolean passedSellIn(Item item) {
        return item.sellIn < 0;
    }

    private void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    private void increaseQuality(Item item) {
        if (item.quality < HIGHEST_QUALITY) {
            item.quality++;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > LOWEST_QUALITY) {
            item.quality--;
        }
    }
}
