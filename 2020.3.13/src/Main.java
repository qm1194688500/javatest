import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] array = new int[10];
        for (int i = 0; i <n.length() ; i++) {
            array[n.charAt(i)-'0']++;
            }
            for (int j = 0; j <array.length ; j++) {
                if (array[j]>0){
                    System.out.println(j+":"+array[j]);
                }
        }

    }
}
