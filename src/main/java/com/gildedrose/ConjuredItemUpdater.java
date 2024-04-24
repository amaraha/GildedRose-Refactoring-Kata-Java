package com.gildedrose;

public class ConjuredItemUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        decreaseQuality(item);
        if (passedSellIn(item)) {
            decreaseQuality(item);
        }
        decreaseSellIn(item);
    }

    private void decreaseQuality(Item item) {
        item.quality -= getDegradationFactor(item);
    }

    private int getDegradationFactor(Item item) {
        if (item.quality > 1) {
            return 2;
        }
        if (item.quality > 0) {
            return 1;
        }
        return 0;
    }
}
