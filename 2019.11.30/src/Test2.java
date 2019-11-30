public class Test2 {
    public static void main(String[] args) {
        String a = "aabbccaaddaa";
        String b = func(a);
        System.out.println(b);
    }
    public static String func(String str){
        if (str==null||str.length()<=0){
            return null;
        }
        char ch = str.charAt(0);
        int repCount = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <str.length() ; i++) {
            if (str.charAt(i)==ch){
                repCount++;
            }else {
                sb.append(repCount).append(ch);
                ch = str.charAt(i);
                repCount = 1;
            }
        }
        return sb.append(repCount).append(ch).toString();
    }
}
