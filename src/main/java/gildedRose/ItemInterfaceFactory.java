package gildedRose;

public class ItemInterfaceFactory {

    public static ItemInterface createItemInterFace(String name){
        switch (name) {
            case "Aged Brie":
                return new AgedBrie();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePasses();
            case "Sulfuras, Hand of Ragnaros":
                return  new Sulfuras();
            default:
                return new NormalItem();
        }
    }

}
