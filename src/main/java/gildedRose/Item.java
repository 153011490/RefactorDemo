package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    private ItemInterface itemInterface;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
        switch (name) {
            case "Aged Brie":
                itemInterface = new AgedBrie();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemInterface = new BackstagePasses();
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemInterface = new Sulfuras();
                break;
            default:
                itemInterface = new NormalItem();
        }
        itemInterface.update(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
