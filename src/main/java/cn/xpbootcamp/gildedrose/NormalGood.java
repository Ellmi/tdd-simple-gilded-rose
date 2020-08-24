package cn.xpbootcamp.gildedrose;

import lombok.Getter;

@Getter
public class NormalGood extends Good {
    private int EACH_DAY_REDUCED_QUALITY = 1;

    public NormalGood(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public int getUpdatedSellIn(int day) {
        return this.sellIn - day;
    }

    public int getUpdatedQuality(int day) {
        return this.quality - day * EACH_DAY_REDUCED_QUALITY;
    }
}
