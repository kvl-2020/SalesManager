public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = -1;
        if (sales.length>0) {
            min = sales[0];
        }

        if (sales.length > 0) {
            for (long sale : sales) {
                if (sale < min) {
                    min = sale;
                }
            }
        }
        return min;
    }

    public long croppAverage() {
        long result = -1;
        long min = min();
        long max = max();

        long summ = 0;

        for (long sale : sales) {
            if (sale == max) {
                max = -1;
                continue;
            }
            if (sale == min) {
                min = -1;
                continue;
            }
            summ += sale;

        }

        if (summ > 0 && sales.length > 2) {
            result = summ / (sales.length - 2);
        }
        return result;
    }
}