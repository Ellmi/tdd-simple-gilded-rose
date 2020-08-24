package cn.xpbootcamp.gildedrose;

import lombok.Getter;

@Getter
public class Backstage extends Good {

    private final int EACH_DAY_INCREASED_QUALITY_TEN_DAY_BEFORE = 1;

    public Backstage(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public int getUpdatedSellIn(int day) {
        return this.sellIn - day;
    }

    public int getUpdatedQuality(int day) {
        return this.quality + day * EACH_DAY_INCREASED_QUALITY_TEN_DAY_BEFORE;
    }
}
