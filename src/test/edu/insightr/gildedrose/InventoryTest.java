package edu.insightr.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {



    @Test
    public void updateItemsTest() {

        // Create an new "classic" item
        // in a tab with one element because we implement updateItems for a tab
        Item itemTest[] = new Item[]{  new Item("Elixir of the Mongoose", 5, 7) };
        Inventory inventoryTest = new Inventory(itemTest);


        //After "5 days", its quality should be at 0 and stay at 0

        int i = 6;
        boolean resp = false;

        while ( i > 0){
            inventoryTest.updateQuality();
            i -= 1;
        }

        int finalQuality = itemTest[0].getQuality();

        if (finalQuality == 0){
            resp = true;
        }

        Assert.assertTrue(resp);
    }
}