import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array ={14,12,15,13,11,16};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    /*
    * 归并排序
    * 递归版本
    * */
    //合并数组


    public static void merge(int[] array,int low, int mid, int high){
        int s1 = low;
        int s2 = mid+1;
        int[] tmpArr = new int[high-low+1];
        int i = 0;

        while (s1<=mid && s2<=high){
            if (array[s1]<=array[s2]){
                tmpArr[i++] = array[s1++];
            }else{
                tmpArr[i++] = array[s2++];
            }
        }
        while (s1<=mid){
            tmpArr[i++]=array[s1++];
        }
        while (s2<=high){
            tmpArr[i++]=array[s2++];
        }
        for (int j = 0; j <tmpArr.length ; j++) {
            array[low+j] = tmpArr[j];
        }
    }
    public static void mergeSortInternal(int[] array,int low , int high){
        if (low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        merge(array,low,mid,high);
    }
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }
/*
* 非递归版本
* */

}
