import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] array1 = {1,3,6,9};
        int[] array2 = {2,4,6,8};
        String s = Arrays.toString(merge(array1,array2));
        System.out.println(s);
    }
    public static int[] merge(int[] array1,int[] array2){
        int i=0,j=0,m=0;
        int[] array = new int[array1.length+array2.length];
        while (i<array1.length&&j<array2.length){
            if (array1[i]<=array2[j]) {
                array[m++] = array1[i++];
            }else{
                array[m++] = array2[j++];
            }
        }
        while (i<array1.length){
            array[m++] = array1[i++];
        }
        while (j<array2.length){
            array[m++] = array2[j++];
        }
        return array;
    }
}
