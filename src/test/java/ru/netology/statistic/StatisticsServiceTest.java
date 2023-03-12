package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNew12() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {2, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNew13() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 13};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNew14() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {14, 5, 8, 4, 5, 3, 8, 6, 11, 11, 13};
        long expected = 14;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}