package ru.netology.stats.service.calculate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceCalculateTest {
    @Test
    public void testSumInt() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumInt(data);
        assertEquals(expected, actual);
    }

    @Test
    public void testMidAmount() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.midAmount(data);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxMonth() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // Последний месяц с максимальными продажами (20)
        int actual = service.findMaxMonth(data);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinMonth() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // Месяц с минимальными продажами (7)
        int actual = service.findMinMonth(data);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinSalesNumberOfMonths() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7; // 5 месяцев с продажами ниже среднего (8, 13, 7, 14, 14)
        int actual = service.minSalesNumberOfMonths(data);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxSalesNumberOfMonths() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7; // 5 месяцев с продажами выше среднего (17, 20, 19, 20, 18)
        int actual = service.maxSalesNumberOfMonths(data);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxMonthWithEmptyArray() {
        StatsService service = new StatsService();
        int[] data = {};
        int expected = -1;
        int actual = service.findMaxMonth(data);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinMonthWithEmptyArray() {
        StatsService service = new StatsService();
        int[] data = {};
        int expected = -1;
        int actual = service.findMinMonth(data);
        assertEquals(expected, actual);
    }
}