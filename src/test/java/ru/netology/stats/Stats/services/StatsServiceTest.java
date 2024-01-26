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

    @Test
    public void shouldFindSummaAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSummaAllSales = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18; //сумма всех продаж
        long actualSummaAllSales = service.getSummaAllSales(sales);
        Assertions.assertEquals(expectedSummaAllSales, actualSummaAllSales);
    }

    @Test
    public void shouldFindAverageSalesOfMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSalesOfMonth = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12; //средняя сумма всех продаж в месяц
        long actualAverageSalesOfMonth = service.getAverageSalesOfMonth(sales);
        Assertions.assertEquals(expectedAverageSalesOfMonth, actualAverageSalesOfMonth);
    }

    @Test
    public void shouldFindNumberMonthSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNumberMonthSalesBelowAverage = 5; // количество месяцев, в которых продажи были ниже среднего
        long actualNumberMonthSalesBelowAverage = service.getNumberMonthSalesBelowAverage(sales);
        Assertions.assertEquals(expectedNumberMonthSalesBelowAverage, actualNumberMonthSalesBelowAverage);
    }

    @Test
    public void shouldFindNumberMonthSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNumberMonthSalesAboveAverage = 5; // количество месяцев, в которых продажи были выше среднего
        long actualNumberMonthSalesAboveAverage = service.getNumberMonthSalesAboveAverage(sales);
        Assertions.assertEquals(expectedNumberMonthSalesAboveAverage, actualNumberMonthSalesAboveAverage);
    }
}



