package foo.bar;

public class Foo {

    public static void main(String[] args) throws InterruptedException {
        int n = 100;

        for (int i = 0; i < n; i++) {
            System.out.print(i);
            Thread.sleep(1000);
        }
    }
}
