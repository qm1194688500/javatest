import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {14, 12, 15, 13, 11, 16};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    /*
     * 归并排序
     * 递归版本
     * */
    //合并数组


    public static void merge(int[] array, int low, int mid, int high) {
        int s1 = low;
        int s2 = mid + 1;
        int[] tmpArr = new int[high - low + 1];
        int i = 0;

        while (s1 <= mid && s2 <= high) {
            if (array[s1] <= array[s2]) {
                tmpArr[i++] = array[s1++];
            } else {
                tmpArr[i++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            tmpArr[i++] = array[s1++];
        }
        while (s2 <= high) {
            tmpArr[i++] = array[s2++];
        }
        for (int j = 0; j < tmpArr.length; j++) {
            array[low + j] = tmpArr[j];
        }
    }

    public static void mergeSortInternal(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSortInternal(array, low, mid);
        mergeSortInternal(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void mergeSort(int[] array) {
        mergeSortInternal(array, 0, array.length - 1);
    }

    /*
     * 非递归版本
     * */
    public static void mergeSort1(int[] array) {
        for (int i = 0; i < array.length; i *= 2) {
            merge1(array, i);
        }
    }

    public static void merge1(int[] array, int gap) {
        int[] tmpArr = new int[array.length];
        int k = 0;//下标

        int s1 = 0;
        int e1 = s1 + gap - 1;
        int s2 = e1 + 1;
        int e2 = s2 + gap - 1 < array.length ? s2 + gap - 1 : array.length - 1;

        //两个归并段都有数据
        while (s2 < array.length) {

            while (s1 <= e1 && s2 <= e2) {
                if (array[s1] <= array[s2]) {
                    tmpArr[k++] = array[s1++];
                } else {
                    tmpArr[k++] = array[s2++];
                }
            }

            while (s1 <= e1) {
                tmpArr[k++] = array[s1++];
            }

            while (s2 <= e2) {
                tmpArr[k++] = array[s2++];
            }

            s1 = e2 + 1;
            e1 = s1 + gap - 1;
            s2 = e1 + 1;
            e2 = s2 + gap - 1 < array.length ? s2 + gap - 1 : array.length - 1;
        }
        //判断是不是还有一个归并段，且这个归并段一定是s1那个段,直接小于e1可能会越界
        while (s1 <= array.length - 1) {
            tmpArr[k++] = array[s1++];
        }

        for (int i = 0; i < tmpArr.length; i++) {
            array[i] = tmpArr[i];
        }
    }
}
