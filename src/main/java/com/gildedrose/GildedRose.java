package com.gildedrose;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item currentItem : items) {
            switch (currentItem.name) {
                case "Aged Brie":
                    new AgedBrieItemUpdater().update(currentItem);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    new BackstagePassesItemUpdater().update(currentItem);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    new SulfurasItemUpdater().update(currentItem);
                    break;
                default:
                    new NormalItemUpdater().update(currentItem);
                    break;
            }
        }

    }

}
