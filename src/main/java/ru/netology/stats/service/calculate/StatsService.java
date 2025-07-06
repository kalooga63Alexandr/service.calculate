package ru.netology.stats.service.calculate;

public class StatsService {
    // Метод для нахождения суммы всех чисел массива
    public long sumInt(long[] data) {
        long result = 0;
        for (long datum : data) {
            result = result + datum;
        }
        return result;
    }
    //Метод расчета средней суммы продаж
    public long midAmount(long[] data) {
        long sumInt = sumInt(data);
        return sumInt / data.length;
    }


    // Метод для нахождения номера месяца с максимальными продажами
    public int findMaxMonth(long[] data) {
        if (data == null || data.length == 0) {
            return -1; // возвращаем -1 если массив пустой или null
        }

        int maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] >= data[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex + 1; // +1 потому что месяцы нумеруются с 1
    }


    // Метод для нахождения номера месяца с минимальными продажами
    public int findMinMonth(long[] data) {
        if (data == null || data.length == 0) {
            return -1; // возвращаем -1 если массив пустой или null
        }

        int minIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] <= data[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex + 1; // +1 потому что месяцы нумеруются с 1
    }

    public int minSalesNumberOfMonths(long[] data) {
        int countMonth = 0;
        long mid = midAmount(data);
        for (long datum : data) {
            if (datum < mid) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int maxSalesNumberOfMonths(long[] data) {
        long mid = midAmount(data);
        int countMonth = 0;
        for (long datum : data) {
            if (datum > mid) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
