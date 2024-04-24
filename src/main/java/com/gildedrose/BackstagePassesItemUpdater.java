package com.gildedrose;

public class BackstagePassesItemUpdater implements ItemUpdater {

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
}
