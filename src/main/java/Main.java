import ru.netology.stats.service.calculate.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] data = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //int[] data = new int[]{18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18};
        int sum = service.sumInt(data);
        System.out.println("Total sales: " + sum);

        int mid = service.midAmount(data);
        System.out.println(mid);

        int maxMonth = service.findMaxMonth(data);
        System.out.println("Month with peak sales: " + maxMonth);

        int minMonth = service.findMinMonth(data);
        System.out.println("Month with minimum sales: " + minMonth);

        int minSalesNumberOfMonths = service.minSalesNumberOfMonths(data);
        System.out.println("Минимальные продажи в течение " + minSalesNumberOfMonths + " месяцев(а)");

        int maxSalesNumberOfMonths = service.maxSalesNumberOfMonths(data);
        System.out.println("Максимальные продажи в  течении " + maxSalesNumberOfMonths + " месяцев(а)");

    }
}

