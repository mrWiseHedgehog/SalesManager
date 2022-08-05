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
}