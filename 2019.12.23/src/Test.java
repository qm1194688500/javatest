

public class Test {
    public static int partion(int[] array,int start,int end){
        int tmp = array[start];
        while (start<end){
            while ((start<end)&&array[start]>=tmp){
                end--;
            }
            if (start>=end){
                break;
            }else{
                array[start] = array[end];
            }
            while ((start<end)&&array[start]>=tmp){
                start++;
            }
            if (start>=end){
                break;
            }else{
                array[end] = array[start];
            }
        }
        array[start] = tmp;
        return start;
    }
    public static void bobbleSort(int[] array){
        boolean flg = false;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(!flg) {
                break;
            }
        }
    }
    public static void main(String[] args) {

    }
}
