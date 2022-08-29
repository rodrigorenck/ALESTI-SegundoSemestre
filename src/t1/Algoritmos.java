package t1;

import static java.lang.Math.abs;

public class Algoritmos {

    /**
     * Algoritmo 1
     */
    public static int f1(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n; i <= n + 1; i++) {//O(n) + 1
            for (j = n + 1; j <= n + i; j += i) { //O(n) + i
                for (k = 1; k <= i * i; k += i / 2 + 1) { //O(i*i)
                    res = res + 1;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }

    /**
     * Algoritmo 2
     */
    public static int f2(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n; i <= n + 1; i += 2)
            for (j = n + 1; j <= n * n; j += 2)
                for (k = i + 1; k <= 2 * n; k += 2) {
                    res = res + n * k;
                    cont_op++;
                }
        return cont_op;
    }

    /**
     * Algoritmo 3
     */
    public static int f3(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n + 1; i <= n + 1; i += 1)
            for (j = n; j <= i + 1; j += j / 2 + 1)
                for (k = j; k <= n * j; k += abs(j - i) + 1) {
                    res = res + n * k;
                    cont_op++;
                }
        return cont_op;
    }

    /**
     * Algoritmo 4
     */
    public static int f4(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n / 2; i <= n * n; i += 1)
            for (j = 1; j <= n * n; j += i / 2 + 1)
                for (k = 2; k <= i * j; k += j / 2 + 1) {
                    res = res + n - 1;
                    cont_op++;
                }
        return cont_op;
    }

    /**
     * Algoritmo 5
     */
    public static int f5(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n / 2; i <= n + 1; i += 2)
            for (j = i; j <= n * i; j += i / 2 + 1)
                for (k = i + 1; k <= n * j; k += 1) {
                    res = res + k * j;
                    cont_op++;
                }
        return cont_op;
    }


    public static void main(String[] args) {

        //algoritmo 1
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ";" + f1(i));
        }


    }
}
