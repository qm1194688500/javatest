import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        double r = Math.sqrt((Math.pow(x1-x2,2)+Math.pow(y1-y2,2)+Math.pow(z1-z2,2)));
        double v = 4/3.0*Math.acos(-1)*Math.pow(r,3);
        System.out.println(String.format("%.3f",r)+" "+String.format("%.3f",v));
    }
}
