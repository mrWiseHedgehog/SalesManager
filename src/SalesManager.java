public class SalesManager {
    protected int[] sales = {1, 54, 12, 23};
    // заполненый массив для демонстрации работы метода max
    public SalesManager() {
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
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int grandMean() {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (sum - min() - max()) / (sales.length - 2);
    }
}