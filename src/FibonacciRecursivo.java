public class FibonacciRecursivo {

    static int contOp = 0;

    public static int fibonnaci(int n) {
        contOp++;
        if (n <= 1) return 1;
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            fibonnaci(i);
            System.out.println(i + " - " + contOp);
        }
    }

}
