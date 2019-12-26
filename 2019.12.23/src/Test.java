
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

    }
    public static void main(String[] args) {

    }
}
