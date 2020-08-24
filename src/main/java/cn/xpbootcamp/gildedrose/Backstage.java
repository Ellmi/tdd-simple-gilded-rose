package cn.xpbootcamp.gildedrose;

import lombok.Getter;

@Getter
public class Backstage extends Good {
    public Backstage(int sellIn, int quality) {
        super(sellIn, quality);
    }
}
