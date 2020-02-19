import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {


    }
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            if (!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }
        Iterator<Integer> integerIterator = set.iterator();

        return integerIterator.next();
    }
}
