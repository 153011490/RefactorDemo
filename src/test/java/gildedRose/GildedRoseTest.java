package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_sellIn_is_9_quality_is_9_when_call_updateQuality_given_a_normal_item_with_sellIn_is_10_quality_is_10() {
        Item item = new Item("Oreo", 10, 10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(9, item.quality);
        assertEquals(9,item.sellIn);
    }

    @Test
    public void should_return_sellIn_is_9_quality_is_0_when_call_updateQuality_given_a_normal_item_with_sellIn_is_10_quality_is_0() {
        Item item = new Item("Oreo", 10, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(9,item.sellIn);
    }

    @Test
    public void should_return_sellIn_less_0_quality_is_8_when_call_updateQuality_given_a_normal_item_with_sellIn_is_0_quality_is_10() {
        Item item = new Item("Oreo", 0, 10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(8, item.quality);
        assertEquals(-1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_less_0_quality_is_0_when_call_updateQuality_given_a_normal_item_with_sellIn_is_0_quality_is_1() {
        Item item = new Item("Oreo", 0, 1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_less_0_quality_is_10_when_call_updateQuality_given_a_Sulfuras_item_with_sellIn_less_0_quality_is_10() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(10, item.quality);
        assertEquals(-1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_is_1_quality_is_10_when_call_updateQuality_given_a_Sulfuras_item_with_sellIn_is_1_quality_is_10() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 1, 10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(10, item.quality);
        assertEquals(1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_minus_2_quality_is_0_when_call_updateQuality_given_a_normal_item_with_sellIn_minus_1_quality_is_0() {
        Item item = new Item("Oreo", -1, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-2,item.sellIn);
    }

    @Test
    public void should_return_sellIn_1_quality_0_when_call_updateQuality_given_a_normal_item_with_sellIn_2_quality_0() {
        Item item = new Item("Oreo", 2, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_minus_1_quality_0_when_call_updateQuality_given_a_Sulfuras_item_with_sellIn_minus_1_quality_0() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_1_quality_0_when_call_updateQuality_given_a_Sulfuras_item_with_sellIn_1_quality_0() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 1, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_minus_1_quality_0_when_call_updateQuality_given_a_Backstage_item_with_sellIn_0_quality_10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_0_quality_13_when_call_updateQuality_given_a_Backstage_item_with_sellIn_1_quality_10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(13, item.quality);
        assertEquals(0,item.sellIn);
    }

    @Test
    public void should_return_sellIn_minus_1_quality_0_when_call_updateQuality_given_a_Backstage_item_with_sellIn_0_quality_48() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 48);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_0_quality_50_when_call_updateQuality_given_a_Backstage_item_with_sellIn_1_quality_48() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 48);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(0,item.sellIn);
    }

    @Test
    public void should_return_sellIn_9_quality_50_when_call_updateQuality_given_a_Backstage_item_with_sellIn_10_quality_48() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(9,item.sellIn);
    }

    @Test
    public void should_return_sellIn_minus_1_quality_0_when_call_updateQuality_given_a_Backstage_item_with_sellIn_0_quality_49() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-1,item.sellIn);
    }

    @Test
    public void should_return_sellIn_0_quality_50_when_call_updateQuality_given_a_Backstage_item_with_sellIn_1_quality_49() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(0,item.sellIn);
    }

    @Test
    public void should_return_sellIn_9_quality_50_when_call_updateQuality_given_a_Backstage_item_with_sellIn_10_quality_49() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(9,item.sellIn);
    }

}