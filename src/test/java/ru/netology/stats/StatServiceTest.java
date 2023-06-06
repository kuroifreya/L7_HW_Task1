package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldSummarize() {
        StatsService sum = new StatsService();

        int expected = 180;
        int actual = sum.calculateSum(salesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverage() {
        StatsService average = new StatsService();

        int expected = 15;
        int actual = average.calculateAverage(salesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindPeakMonth() {
        StatsService peakMonth = new StatsService();

        int expected = 8;
        int actual = peakMonth.findPeakSalesMonth(salesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService minMonth = new StatsService();

        int expected = 9;
        int actual = minMonth.findMinSalesMonth(salesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBadMonths() {
        StatsService numberBadMonths = new StatsService();

        int expected = 5;
        int actual = numberBadMonths.countBelowAverageMonths(salesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBGoodMonths() {
        StatsService numberGoodMonths = new StatsService();

        int expected = 5;
        int actual = numberGoodMonths.countAboveAverageMonths(salesByMonths);

        Assertions.assertEquals(expected, actual);
    }
}
