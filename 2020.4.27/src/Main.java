import java.util.*;
public class Main {
    public static void main(String[] args) {

    }
    public int findMaxGap(int[] A, int n) {
        int max1=A[0]; //定义一个最区间最大值初始为A[0]
        int max=Math.abs(A[0]-A[A.length-1]);
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max1=A[i];
            }
            int max2=A[A.length-1]; //每次从n-1开始在右区间找最大值
            for(int j=A.length-1;j>i;j--){
                if(A[j]>max2){
                    max2=A[j];
                }
                if(Math.abs(max1-max2)>max){
                    max=Math.abs(max1-max2);
                }
            }
        }
        return max;
    }
    public ArrayList<Integer> printMatrix(int [][] array) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(array.length==0) return result;
        int n = array.length,m = array[0].length;
        if(m==0) return result;
        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++) result.add(array[i][k]);//左至右
            for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//右上至右下
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//右至左
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//左下至左上
        }
        return result;
    }
}
