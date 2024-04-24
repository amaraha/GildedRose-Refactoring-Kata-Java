package com.gildedrose;

public interface ItemUpdater {

    void update(Item item);

    default boolean passedSellIn(Item item) {
        return item.sellIn < 0;
    }

    default void decreaseSellIn(Item item) {
        item.sellIn--;
    }
}
