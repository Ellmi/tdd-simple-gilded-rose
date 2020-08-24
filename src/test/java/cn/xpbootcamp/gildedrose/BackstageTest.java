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

    @Test
    public void should_increase_two_when_get_good_updatedQuality_and_updatedSelIn_given_one_day_passed_and_updatedSellIn_in_ten_days() {

        Backstage backstage1 = new Backstage(10, 45);
        Backstage backstage2 = new Backstage(9, 45);

        Assert.assertEquals(9, backstage1.getUpdatedSellIn(1));
        Assert.assertEquals(47, backstage1.getUpdatedQuality(1));

        Assert.assertEquals(8, backstage2.getUpdatedSellIn(1));
        Assert.assertEquals(47, backstage2.getUpdatedQuality(1));
    }

    @Test
    public void should_not_return_greater_than_max_when_get_good_updatedQuality_and_updatedSelIn_given_one_day_passed() {

        Backstage backstage1 = new Backstage(10, 49);
        Backstage backstage2 = new Backstage(10, 50);
        Backstage backstage3 = new Backstage(5, 49);

        Assert.assertEquals(9, backstage1.getUpdatedSellIn(1));
        Assert.assertEquals(50, backstage1.getUpdatedQuality(1));

        Assert.assertEquals(9, backstage2.getUpdatedSellIn(1));
        Assert.assertEquals(50, backstage2.getUpdatedQuality(1));

        Assert.assertEquals(4, backstage3.getUpdatedSellIn(1));
        Assert.assertEquals(50, backstage3.getUpdatedQuality(1));
    }
}
