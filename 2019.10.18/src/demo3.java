public class demo3 {
    public static void main(String[] args) {
        /*int[] arr = {1,2,3,4,5,6};
        double ret = avg(arr);
        System.out.println(ret);
        -------------------------
        int[] arr = {1,5,4,8,9,6,3};
        System.out.println(find(arr,5));*/

    }
    public static double avg(int[] arr){
        int sum = 0;
        for (int x : arr){
            sum += x;
        }
        return (double)sum/(double)arr.length;
    }
    public static int find(int[] arr,int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;//表示没找到
    }
    public static int binarySearch(int[] arr, int toFind){
        int left = 0;
        int right = arr.length-1;
        int mid = (left + right)/2;
        while(left <= right){
            if(toFind < arr[mid]){
                right = mid
            }
        }
    }
}
