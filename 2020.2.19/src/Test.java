import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for(char ch1 : str2.toUpperCase().toCharArray()){
            set.add(ch1);
        }
        Set<Character> broken = new HashSet<>();
        for(char ch2 : str1.toUpperCase().toCharArray()) {
            if (!set.contains(ch2) && !broken.contains(ch2)) {
                broken.add(ch2);
                System.out.print(ch2);
            }
        }
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
    public int numJewelsInStones(String J, String S) {
        Set set = new HashSet<>();
        for (int i = 0; i <J.length() ; i++) {
            set.add(J.charAt(i));
        }
        int count = 0;
        for (int i = 0; i <S.length() ; i++) {
            if (set.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
