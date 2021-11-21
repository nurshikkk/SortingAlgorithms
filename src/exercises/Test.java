package exercises;

public class Test {
    public static void swapWords(String str, String str2) {
        str += str2;
        str2 = str.substring(0, (str.length()) - (str2.length()));
        str = str.substring(str2.length());

        System.out.println("str:" + " " + str + ", str2:" + " " + str2);
    }

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

        swapWords("Mechanic", "Person");
    }
}