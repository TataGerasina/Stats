package ru.netology.stats.Stats.services;

import com.sun.source.doctree.SummaryTree;

import java.util.stream.LongStream;

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

    public int getMinSales(long[] sales) {
        int minMonth = getMinSalesMonth(sales);
        return (int) sales[minMonth];
    }

    public long getSummaAllSales(long[] sales) {
        long sum;
        sum = LongStream.of(sales).sum();

        return sum; //сумма всех продаж за 12 месяцев (с 0 до 11 в массиве)
    }

    public long getAverageSalesOfMonth(long[] sales) {
long average;
int month =12;
average = LongStream.of(sales).sum()/ month;

return average; // средняя сумма продаж в месяц;
    }
}
