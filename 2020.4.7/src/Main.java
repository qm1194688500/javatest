import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
          String[] arr = str.split(" ");
          StringBuilder stringBuilder = new StringBuilder();
            for (int i = arr.length-1; i >=0 ; i--) {
                if (i==0){
                    stringBuilder.append(arr[i]);
                }else{
                    stringBuilder.append(arr[i]+" ");
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
