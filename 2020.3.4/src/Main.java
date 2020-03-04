import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = method(str);
        System.out.println(str2);
    }

    public static String method(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {  //当前的是数字
                int index = i;
                count = 1;    //初始化计数器
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] >= '0' && arr[j] <= '9') {
                        count++;
                        index = j;
                    } else {
                        break;
                    }
                }
                if (count > result.length()) {
                    result = str.substring(i, index + 1);
                }
            } else {
                continue;
            }
        }
        return result;
    }
}
