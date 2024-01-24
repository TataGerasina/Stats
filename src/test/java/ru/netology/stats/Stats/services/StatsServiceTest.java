package ru.netology.stats.Stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8; //месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
        int actualMonth = service.getMaxSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9; //месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
        int actualMonth = service.getMinSalesMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}


