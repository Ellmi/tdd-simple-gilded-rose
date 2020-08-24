package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class BackstageTest {

    @Test
    public void should_return_correct_value_when_get_good_info_given_good_sellIn_and_quality() {

        Backstage backstage = new Backstage(10, 20);

        Assert.assertEquals(10, backstage.getSellIn());
        Assert.assertEquals(20, backstage.getQuality());
    }

    @Test
    public void should_increase_one_when_get_good_updatedQuality_and_updatedSelIn_given_one_day_passed_and_updatedSellIn_greater_than_ten() {

        Backstage backstage = new Backstage(15, 20);

        Assert.assertEquals(14, backstage.getUpdatedSellIn(1));
        Assert.assertEquals(21, backstage.getUpdatedQuality(1));
    }
}
