
public class Test {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        if (nums.length<1){
            return 0;
        }
        int i =0;
        int j = 1;
        for (int k = 0; k < nums.length; k++) {
            if (nums[i]==nums[j]){
                j++;
            }else{
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i;
    }
}
