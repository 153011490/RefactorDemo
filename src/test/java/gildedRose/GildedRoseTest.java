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


}