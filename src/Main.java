public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{5, 77, 31, 22});
        System.out.println("Max sale: " + salesManager.max());
        System.out.println("Min sale: " + salesManager.min());
        System.out.println("Обрезанное среднее: " + salesManager.croppAverage());
    }
}
