public class Polinomial {

    public static int f(int n){
        int r = 0;
        for(int i = 0; i<n; i++){
            for (int j = i+2; j<=2*n; j++){
                r = r+1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        for(int i = 0; i<=100; i++){
            System.out.println(i + ";" +  f(i));
        }
    }
}
