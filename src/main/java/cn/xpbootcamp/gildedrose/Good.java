package cn.xpbootcamp.gildedrose;

import lombok.Getter;

public class Good {
    @Getter
    protected int sellIn;
    @Getter
    protected int quality;
    protected int QUALITY_MAX_LIMIT = 50;
    protected int QUALITY_MIN_LIMIT = 0;

    public Good(int sellIn, int quality) {

        if (quality > QUALITY_MAX_LIMIT || quality < QUALITY_MIN_LIMIT)
            throw new IllegalArgumentException("illegal quality value");
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getUpdatedSellIn(int day) {
        return this.sellIn - day;
    }

}
