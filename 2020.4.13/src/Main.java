import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                int Judge = sc.nextInt();
                int length = sc.nextInt();
                if (Judge==1){
                    list.add(length);
                }else{
                    int idx = list.indexOf(length);
                    list.remove(idx);
                }
                if (list.size()<3){
                    System.out.println("No");
                }else{
                    Collections.sort(list,Collections.reverseOrder());
                    int sum=0;
                    int max = list.get(0);
                    for (int j = 1; j <list.size() ; j++) {
                        sum+=list.get(j);
                    }
                    if (sum>max){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
            }
    }

}
