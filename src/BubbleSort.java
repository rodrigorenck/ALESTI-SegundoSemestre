/**
 * Algoritmo de ordenacao de array
 * Utiliza uma variavel temporaria (aux) para realizar a troca
 * O(n^2) -> polinomial (?)
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] colecao){
        for(int i = 0; i< colecao.length; i++){ //O(n)
            boolean trocou = false;
            for(int j = 0; j< colecao.length-i-1; j++){ //O(n)
                if(colecao[j]> colecao[j+1]){
                    int aux = colecao[j];
                    colecao[j] = colecao[j+1];
                    colecao[j+1] = aux;
                    trocou = true;
                }
            }
            if(!trocou) break;
        }
        return colecao;
    }

    // O(n)*O(n) -> O(n^2)

    public static void main(String[] args) {
        int[] colecao = {10, 3 ,8, 9, 26, 13, 48};

        int[] colecaoOrdenada = bubbleSort(colecao);

        for (int inteiro :
                colecaoOrdenada) {
            System.out.println(inteiro);
        }
    }
}
