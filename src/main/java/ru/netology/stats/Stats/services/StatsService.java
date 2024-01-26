package ru.netology.stats.Stats.services;


public class StatsService {

    public int getMaxSalesMonth(long[] sales) {
        int maxMonth = 0; // номер месяца с макс продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как макс
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMinSalesMonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long getSummaAllSales(long[] sales) {
        long sum = 0;

        for (long i : sales) {
            sum += i;
        }
        return sum; //сумма всех продаж за 12 месяцев (с 0 до 11 в массиве)
    }

    public long getAverageSalesOfMonth(long[] sales) {
        long average;
        int month = 12;
        long sum = 0;

        for (long i : sales) {
            sum += i;
        }
        average = sum / month;

        return average; // средняя сумма продаж в месяц;
    }

    public int getNumberMonthSalesBelowAverage(long[] sales) {
        int month = 0;
        long average = getAverageSalesOfMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) { // значит, в рассматриваемом i-м месяце продаж меньше среднего
                month++; // запомним его и посчитаем!
            }
        }
        return month;
    }

    public int getNumberMonthSalesAboveAverage(long[] sales) {
        int month = 0;
        long average = getAverageSalesOfMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) { // значит, в рассматриваемом i-м месяце продаж больше среднего
                month++; // запомним его и посчитаем!
            }
        }
        return month;
    }
}