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
}
