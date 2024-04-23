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
}
