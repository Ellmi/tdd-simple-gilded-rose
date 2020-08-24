package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoodTest {

    @Test
    public void should_throw_exception_when_new_good_given_quality_greater_than_max_limit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Good(10, 60);
        });

        String expectedMessage = "illegal quality value";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void should_throw_exception_when_new_good_given_quality_smaller_than_min_limit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Good(10, -1);
        });

        String expectedMessage = "illegal quality value";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}
