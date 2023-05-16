package SampleTest.Problem2;

public class Main {
    public static void main(String[] args) {
        BookInventory inventory = new BookInventory();
        inventory.addBook("Probability & Statistics 1", 10);
        inventory.addBook("Pure Mathematics 2 & 3", 200);
        inventory.addBook("Phy", 52);

        inventory.removeBook("Pure Mathematics 2 & 3", 30);
//        inventory.removeBook("Phy", 60);

        System.out.println(inventory.getBookQuantity("Probability & Statistics 1"));
        System.out.println(inventory.getBookQuantity("Pure Mathematics 2 & 3"));
        System.out.println(inventory.getBookQuantity("Phy"));
        System.out.println(inventory.getBookQuantity("Joe"));
    }
}
