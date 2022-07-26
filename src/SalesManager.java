public class SalesManager {
    protected long[] sales = {1, 54, 12, 23};
    // заполненый массив для демонстрации работы метода max
    public SalesManager() {
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
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long grandMean() {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum - min() - max()) / (sales.length - 2);
    }
}