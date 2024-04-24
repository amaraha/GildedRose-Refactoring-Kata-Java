package com.gildedrose;

public class BackstagePassesItemUpdater implements ItemUpdater {

    public static final int HIGHEST_QUALITY = 50;

    @Override
    public void update(Item currentItem) {
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

    private void increaseQuality(Item item) {
        if (item.quality < HIGHEST_QUALITY) {
            item.quality++;
        }
    }
}
