import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        while(sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<String> arr = new ArrayList<>();
            for(int i = 0;i<n;i++){
                String str = sc.next();
                str = str.replace("-","");
                String ret = "";
                for(int j = 0;j<7;j++){
                    ret += number.charAt(symbol.indexOf(str.charAt(j)+""));
                }
                ret = ret.substring(0,3)+"-"+ret.substring(3,7);
                if(!arr.contains(ret)){
                    arr.add(ret);
                }
            }
            Collections.sort(arr);
            for(int i = 0;i<arr.size();i++){
                System.out.println(arr.get(i));
            }
            System.out.println();
        }
    }
}
