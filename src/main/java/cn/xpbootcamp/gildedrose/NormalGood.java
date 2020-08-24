package cn.xpbootcamp.gildedrose;

import lombok.Getter;

@Getter
public class NormalGood extends Good {
    private final int EACH_DAY_REDUCED_QUALITY_OVERDUE = 2;
    private final int EACH_DAY_REDUCED_QUALITY_NOT_OVERDUE = 1;

    public NormalGood(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public int getUpdatedQuality(int day) {

        int eachDayReducedQuality = EACH_DAY_REDUCED_QUALITY_NOT_OVERDUE;

        if (this.sellIn < day) eachDayReducedQuality = EACH_DAY_REDUCED_QUALITY_OVERDUE;

        int updatedQuality = this.quality - day * eachDayReducedQuality;
        return Math.max(QUALITY_MIN_LIMIT, updatedQuality);
    }
}
