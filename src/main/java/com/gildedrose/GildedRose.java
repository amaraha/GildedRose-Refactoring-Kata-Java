package com.gildedrose;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item currentItem : items) {
            ItemUpdaterFactory.updaterFor(currentItem).update(currentItem);
        }
    }

}
