package com.gildedrose;

public class AgedBrieItemUpdater implements ItemUpdater {

    @Override
    public void update(Item currentItem) {
        increaseQuality(currentItem);
        decreaseSellIn(currentItem);
        if (passedSellIn(currentItem)) {
            increaseQuality(currentItem);
        }
    }

}
