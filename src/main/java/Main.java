import ru.netology.stats.service.calculate.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] data = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //long[] data = new long[]{18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18};
        long sum = service.sumInt(data);
        System.out.println("Сумма всех продаж: " + sum);

        long mid = service.midAmount(data);
        System.out.println("Средняя сумма продаж: " + mid);

        long maxMonth = service.findMaxMonth(data);
        System.out.println("Месяц с максимальными продажами: " + maxMonth);

        long minMonth = service.findMinMonth(data);
        System.out.println("Месяц с минимальными продажами: " + minMonth);

        long minSalesNumberOfMonths = service.minSalesNumberOfMonths(data);
        System.out.println("Минимальные продажи в течение " + minSalesNumberOfMonths + " месяцев(а)");

        long maxSalesNumberOfMonths = service.maxSalesNumberOfMonths(data);
        System.out.println("Максимальные продажи в  течении " + maxSalesNumberOfMonths + " месяцев(а)");

    }
}

