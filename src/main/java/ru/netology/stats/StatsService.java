package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int s : sales) {
            sum = sum + s;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int average = calculateSum(sales) / sales.length;
        return average;
    }

    public int findPeakSalesMonth(int[] sales) {
        int peakMonthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[peakMonthNumber] <= sales[i]) {
                peakMonthNumber = i;
            }
        }
        return peakMonthNumber + 1;
    }

    public int findMinSalesMonth(int[] sales) {
        int minMonthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[minMonthNumber] >= sales[i]) {
                minMonthNumber = i;
            }
        }
        return minMonthNumber + 1;
    }

    public int countBelowAverageMonths(int[] sales) {
        int numberBadMonths = 0;
        int average = calculateAverage(sales);
        for (int s : sales) {
            if (s < average) {
                numberBadMonths++;
            }
        }
        return numberBadMonths;
    }

    public int countAboveAverageMonths(int[] sales) {
        int numberGoodMonths = 0;
        int average = calculateAverage(sales);
        for (int s : sales) {
            if (s > average) {
                numberGoodMonths++;
            }
        }
        return numberGoodMonths;
    }
}
