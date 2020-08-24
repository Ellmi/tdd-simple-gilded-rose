package cn.xpbootcamp.gildedrose;

import lombok.Getter;

@Getter
public class NormalGood extends Good {
    private final int EACH_DAY_REDUCED_QUALITY_OVERDUE = 2;
    private final int EACH_DAY_REDUCED_QUALITY = 1;

    public NormalGood(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public int getUpdatedSellIn(int day) {
        return this.sellIn - day;
    }

    public int getUpdatedQuality(int day) {
        if (this.sellIn < day) return this.quality - day * EACH_DAY_REDUCED_QUALITY_OVERDUE;
        return this.quality - day * EACH_DAY_REDUCED_QUALITY;
    }
}
