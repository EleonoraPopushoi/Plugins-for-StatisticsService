package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */

    public long calculateSum(long[] incomes) {
        long sum = 0;
        for (long purchase : incomes) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }


    public long findMin(long[] incomes) {
        long current_min_index = 0;
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }

    public long findAverage(long[] purchases) {
        long sum = 0;
        for (long d : purchases) {
            // d is defined as length
            sum += d;
        }

        return sum / purchases.length;

    }

    public long MonthsBelowAveragePurchase(long[] incomes) {

        long average = findAverage(incomes);
        long NumberMonthsBelowAverage = 0;
        for (long belowaveragepurchase : incomes) {
            if (belowaveragepurchase < average) {
                NumberMonthsBelowAverage++;
            }
        }
        return NumberMonthsBelowAverage;

    }


    public long MonthsAboveAveragePurchase(long[] incomes) {
        long average = findAverage(incomes);
        long NumberMonthsAboveAverage = 0;

        for (long aboveaveragepurchase : incomes) {
            if (aboveaveragepurchase > average) {
                NumberMonthsAboveAverage++;
            }
        }
        return NumberMonthsAboveAverage;
    }
}
