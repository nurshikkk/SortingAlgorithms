package exercises;

public class Test {
    public static void swap(int a, int b) {
//        a += b;
//        b = a - b;
//        a = a - b;
        a = a + b - (b = a);

        System.out.println("a:" + " " +  a + ", b:" + " " + b);
    }

    public static void main(String[] args) {
        swap(5645, 341);
        swap(1, 3);
        swap(1000, 900);
    }
}