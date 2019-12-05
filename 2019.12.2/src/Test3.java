public class Test3 {
    public static void main(String[] args) {
        String str = "aabbccdef";
        System.out.println(method(str));
    }
    public static String method(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char temp = str.charAt(i);
            if (!stringBuilder.toString().contains(temp + "")){
                stringBuilder.append(temp);
            }
        }
        return stringBuilder.toString();
    }
}
