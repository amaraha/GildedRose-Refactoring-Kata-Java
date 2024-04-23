package com.gildedrose;

public class AgedBrieItemUpdater implements ItemUpdater {

    public static final int HIGHEST_QUALITY = 50;

    @Override
    public void update(Item currentItem) {
        increaseQuality(currentItem);
        decreaseSellIn(currentItem);
        if (passedSellIn(currentItem)) {
            increaseQuality(currentItem);
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
