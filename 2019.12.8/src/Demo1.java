import java.util.*;

public class Demo1 {
    public static void main1(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("国民老公","胡歌");
        map.put("国民女神","高圆圆");
        map.put("黑旋风","李逵");
        System.out.println(map);
        String s = map.get("及时雨");
        System.out.println(s);
        for (Map.Entry<String,String> entry : map.entrySet()
             ) {
            System.out.println(entry.getKey()+" " +entry.getValue());
        }
    }
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("java");
        collection.add("hello");
        //System.out.println(collection.size());
        //collection.remove("java");
       // System.out.println(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
