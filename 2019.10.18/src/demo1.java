import java.util.Arrays;
public class demo1 {
    public static void main(String[] args) {
       /* int[] array = {1,2,3,4,5};
        int[] array1 = transform(array);
        System.out.println(Arrays.toString(array1));
        -----------------------------------------
        int[] array = {1,2,3,4,5,6};
        String array1 = toString(array);
        System.out.println(array1);*/
        int[] array = {1, 2, 3, 7, 5, 6};

    }

    public static int[] transform(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = 2 * array[i];
        }
        return array;
    }

    public static String toString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length - 1) {
                ret += ", ";
            }
        }
        return ret + "]";
    }

    public static int Max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int Small(int[] array) {
        int small = array[0];
        for (int i = 1; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        return small;
    }

    public static int aver(int[] array) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
        }
        return ret / (array.length);
    }

    private static int recursiveFind(int[] arr, int start, int end, int searchKey) {
        if (start <= end) {
            int middle = (start + end) / 2;
            if (searchKey == arr[middle]) {
                return middle;
            } else if (searchKey < arr[middle]) {
                return recursiveFind(arr, start, middle - 1, searchKey);
            } else {
                return recursiveFind(arr, middle + 1, end, searchKey);
            }
        } else {
            return -1;
        }
    }
    public static void bubbleSort(Integer[] arr, int n) {
        if (n <= 1) return;       //如果只有一个元素就不用排序了
        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {        //此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面，
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (arr[j] > arr[j + 1]) {        //即这两个相邻的数是逆序的，交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;//没有数据交换，数组已经有序，退出排序
        }
    }
}
