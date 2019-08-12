package gildedRose;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_sellIn_is_9_quality_is_9_when_call_updateQuality_given_a_normal_item_with_sellIn_is_10_quality_is_10() throws Exception {
        Item item = new Item("Oreo", 10, 10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(9, item.quality);
        assertEquals(9,item.sellIn);
    }
}