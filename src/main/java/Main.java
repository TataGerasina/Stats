import ru.netology.stats.Stats.services.StatsService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println(Arrays.toString(arr));

        // 180 "сумма всех продаж за 12 месяцев";
        // 15 "средняя сумма продаж в месяц";
        // 9 " номер месяца, в котором был минимум продаж";
        // 8 " номер месяца, в котором был максимум продаж";
        // 5 " количество месяцев, в которых продажи были ниже среднего";
        // 5 " количество месяцев, в которых продажи были выше среднего";

    }
}