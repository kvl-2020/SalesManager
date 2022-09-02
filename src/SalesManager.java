public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = -1;
        if (sales.length>0) {
            min = sales[0];
        }

        if (sales.length > 0) {
            for (int sale : sales) {
                if (sale < min) {
                    min = sale;
                }
            }
        }
        return min;
    }

    public int croppAverage() {
        int result = -1;
        int min = min();
        int max = max();

        int summ = 0;

        for (int sale : sales) {
            if (sale == max) {
                continue;
            }
            if (sale == min) {
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