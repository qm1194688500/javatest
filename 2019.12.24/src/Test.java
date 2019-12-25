import java.util.Arrays;

public class Test {
    public static void insertSort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int tmp = array[i];
            int j = 0;
            for ( j = i-1; j >=0;j-- ) {
                if (array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1] = tmp;
        }

    }
    public static void shellSort(int[] array) {
        int gap = array.length;
        while (gap > 1) {
            insertSortGap(array, gap);
            gap = (gap / 3) + 1; // OR gap = gap / 2;
        }
        insertSortGap(array, 1);
    }
    private static void insertSortGap(int[] array, int gap) {
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i - gap;
            for (; j >= 0 && array[j] > v; j -= gap) {
                array[j + gap] = array[j];
            }
            array[j + gap] = v;
        }
    }
    public static void selectSort(int[] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                int tmp = array[j];
                if (array[j]<array[i]){
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,445,64,2366,4,4,242};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
