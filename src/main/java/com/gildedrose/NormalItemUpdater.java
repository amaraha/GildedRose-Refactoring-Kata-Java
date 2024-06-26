package com.gildedrose;

public class NormalItemUpdater implements ItemUpdater {

    public static final int LOWEST_QUALITY = 0;

    @Override
    public void update(Item currentItem) {
        if (currentItem.quality > 0) {
            decreaseQuality(currentItem);
        }
        decreaseSellIn(currentItem);
        if (passedSellIn(currentItem)) {
            decreaseQuality(currentItem);
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > LOWEST_QUALITY) {
            item.quality--;
        }
    }
}
