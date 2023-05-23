package Tut.W10.Problem3;

public class Main {
    public static void main (String[] args) {
        PhysicalProduct physicalProduct = new PhysicalProduct();
        Observer observer1 = new ShortRangeObserver("Observer 1");
        Observer observer2 = new LongRangeObserver("Observer 2");
        System.out.println("Short Range Observer 1 Join");
        physicalProduct.addObserver(observer1);

        physicalProduct.setAmount(39);
        physicalProduct.setAmount(27);
        physicalProduct.setAmount(15);
        physicalProduct.setAmount(89);

        System.out.println("Long Range Observer 2 Join");
        physicalProduct.addObserver(observer2);

        physicalProduct.setAmount(300);
        physicalProduct.setAmount(30);
        physicalProduct.setAmount(5);
        physicalProduct.setAmount(60);

        System.out.println("Long Range Observer 2 Leave");
        physicalProduct.removeObserver(observer2);
        physicalProduct.setAmount(300);
        physicalProduct.setAmount(30);
        physicalProduct.setAmount(5);
        physicalProduct.setAmount(60);
    }
}
