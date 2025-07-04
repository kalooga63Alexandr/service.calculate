package ru.netology.stats.service.calculate;

public class StatsService {
    // Метод для нахождения суммы всех чисел массива
    public int sumInt(int[] data) {
        int result = 0;
        for (int datum : data) {
            result = result + datum;
        }
        return result;
    }
    //Метод расчета средней суммы продаж
    public int midAmount(int[] data) {
        int sumInt = sumInt(data);
        return sumInt / data.length;
    }


    // Метод для нахождения номера месяца с максимальными продажами
    public int findMaxMonth(int[] data) {
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
    public int findMinMonth(int[] data) {
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

    public int minSalesNumberOfMonths(int[] data) {
        int month = 0;
        int countMonth = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[month] < midAmount(data)) {
                countMonth++;
            }
            month++;
        }
        return countMonth;
    }

    public int maxSalesNumberOfMonths(int[] data) {
        int mid = midAmount(data);
        int month = 0;
        int countMonth = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[month] > mid) {
                countMonth++;
            }
            month++;
        }
        return countMonth;
    }
}
