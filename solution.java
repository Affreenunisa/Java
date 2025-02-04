public class solution {
    static int findGreatest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a; // a is greatest
        } else if (b >= a && b >= c) {
            return b; // b is greatest
        } else {
            return c; // c is greatest
        }
    }

    public static void main(String[] args) {
        int a = 3, b = 5, c = 2;
        System.out.println("Greatest among three: " + findGreatest(a, b, c));
    }
}

