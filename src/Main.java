public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager();
        System.out.println("Максимальная продажа: " + salesManager.max() + " $");
        System.out.println("Минимальная продажа: " + salesManager.min() + " $");
        System.out.println("Обрезаное среднее из " + salesManager.sales.length + " продаж, равно: " + salesManager.grandMean() + " $");
    }
}
