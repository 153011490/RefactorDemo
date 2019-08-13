package gildedRose;

public class AgedBrie implements ItemInterface{
    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sellIn --;

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality ++;
        }
    }
}
