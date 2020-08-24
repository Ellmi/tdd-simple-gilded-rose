package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class NormalGoodTest {

    @Test
    public void should_return_correct_value_when_get_good_info_given_good_sellIn_and_quality() {

        NormalGood normalGood = new NormalGood(10, 20);

        Assert.assertEquals(10, normalGood.getSellIn());
        Assert.assertEquals(20, normalGood.getQuality());
    }

    @Test
    public void should_reduce_one_when_get_good_updatedQuality_and_updatedSelIn_given_one_day_passed() {

        NormalGood normalGood = new NormalGood(10, 20);

        Assert.assertEquals(9, normalGood.getUpdatedSellIn(1));
        Assert.assertEquals(19, normalGood.getUpdatedQuality(1));
    }

    @Test
    public void should_reduce_two_when_get_good_updatedQuality_and_updatedSelIn_given_one_day_passed_and_updatedSellIn_overdue() {

        NormalGood normalGood1 = new NormalGood(0, 6);
        NormalGood normalGood2 = new NormalGood(-1, 6);

        Assert.assertEquals(-1, normalGood1.getUpdatedSellIn(1));
        Assert.assertEquals(4, normalGood1.getUpdatedQuality(1));

        Assert.assertEquals(-2, normalGood2.getUpdatedSellIn(1));
        Assert.assertEquals(4, normalGood2.getUpdatedQuality(1));
    }
}
