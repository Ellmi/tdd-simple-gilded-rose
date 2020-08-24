package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class NormalGoodTest {

    @Test
    public void should_return_correct_value_when_get_good_info_given_good_sellIn_and_quality () {

        NormalGood normalGood = new NormalGood(10, 20);

        Assert.assertEquals(10,normalGood.getSellIn());
        Assert.assertEquals(20,normalGood.getQuality());
    }
}
