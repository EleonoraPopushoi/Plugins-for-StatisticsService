package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long expected = 85;
        long actual = service.calculateSum(incomesInBillions);

        assertEquals(expected , actual);
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();

        long expected = 3;
        long actual = service.findMin(incomesInBillions);

        assertEquals(expected , actual);
    }

    @Test
    void findAverage() {
        StatisticsService service = new StatisticsService();
        long expected = 7;
        long actual = service.findAverage(incomesInBillions);

        assertEquals(expected , actual);
    }

    @Test
    void MonthsBelowAveragePurchase() {

        StatisticsService service = new StatisticsService();

        long expected = 5;
        long actual = service.MonthsBelowAveragePurchase(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void MonthsAboveAverageOfSum() {
        StatisticsService service = new StatisticsService();

        long expected = 6;
        long actual = service.MonthsAboveAveragePurchase(incomesInBillions);

        assertEquals(expected, actual);

    }


}