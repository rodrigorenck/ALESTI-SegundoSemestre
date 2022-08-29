package pesquisaBinaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PesquisaBinaria {

    @Test
    public void case1(){
        int[] array = {1,8,10,11,30,32,48,56};

        assertEquals(true, binarySearch(array, 48));
    }

    private boolean binarySearch(int[] array, int k) {
        int middlePosition = array.length/2; //arredonda para baixo
        int right = array.length-1;
        int left = 0;

        while(array.length>middlePosition){
            int middleElement = array[middlePosition];
            if(middleElement == k) return true;

            if(k>middleElement){
                left = middlePosition + 1;
            }
            if(k<middleElement){
                right = middlePosition - 1;
            }

            if(left>right) return false;

            middlePosition = (right + left) /2;
        }
        return false;
    }
}
