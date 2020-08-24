package cn.xpbootcamp.gildedrose;

import lombok.Getter;

@Getter
public class NormalGood extends Good {
    public NormalGood(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
