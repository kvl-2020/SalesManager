public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{5, 77, 31, 22});
        System.out.println("Max sale: " + salesManager.max());
        System.out.println("croppAverage: " + salesManager.croppAverage());
    }
}
