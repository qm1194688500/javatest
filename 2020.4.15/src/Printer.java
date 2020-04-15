import java.util.*;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        //有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。
        //
        //给定一个二位数组arr及题目中的参数n，请返回结果数组。
        int[] ret = new int[n*n];
        int index = 0;
        for (int j = n-1; j >=0; j--) {
            int k = j;
            for (int i = 0; i < n-j; i++) {
                ret[index++] = arr[i][k++];
            }
        }
        for (int i = 1; i <n ; i++) {
            int k = i;
            for (int j = 0; j <n-i ; j++) {
                ret[index++] = arr[k++][j];
            }
        }
        return ret;
    }
}