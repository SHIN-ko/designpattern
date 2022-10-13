package Adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdaterImpl();
        System.out.println("adapter = " + adapter.twiceOf(100f));
        System.out.println("adapter = " + adapter.halfOf(88f));

    }
}
