package cn.xpbootcamp.gildedrose;

import lombok.Getter;

@Getter
public class Backstage extends Good {

    private final int EACH_DAY_INCREASED_QUALITY_TEN_DAYS_BEFORE = 1;
    private final int EACH_DAY_INCREASED_QUALITY_IN_TEN_DAYS = 2;
    private final int TEN_DAYS = 10;

    public Backstage(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public int getUpdatedSellIn(int day) {
        return this.sellIn - day;
    }

    public int getUpdatedQuality(int day) {
        int eachDayIncreaseddQuality = EACH_DAY_INCREASED_QUALITY_TEN_DAYS_BEFORE;
        if (this.sellIn - day < TEN_DAYS) eachDayIncreaseddQuality = EACH_DAY_INCREASED_QUALITY_IN_TEN_DAYS;
        return this.quality + day * eachDayIncreaseddQuality;
    }
}
