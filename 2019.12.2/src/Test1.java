
public class Test1 {
    public static void main(String[] args) {
//    String str = "helloword";
//   byte[] data = str.getBytes();
//      for (int i = 0; i <data.length ; i++) {
//           System.out.println(data[i] + " ");
//       }
//       System.out.println(new String(data));
//        System.out.println("u".compareTo("t"));
       /* String str = "hello world hello bit" ;
        String[] result = str.split(" ") ; // 按照空格拆分
        for(String s: result) {
            System.out.println(s);
        }*/
        /*String str = "hello world hello bit" ;
        String[] result = str.split(" ",2) ;
        for(String s: result) {
            System.out.println(s);*/
        /*String str = "192.168.1.1" ;
        String[] result = str.split("\\.") ;
        for(String s: result) {
            System.out.println(s);
        }*/
        /*String str = "name=zhangsan&age=18" ;
        String[] result = str.split("&") ;
        for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split("=") ;
            System.out.println(temp[0]+" = "+temp[1]);
        }*/
//        String str = "helloworld";
//        System.out.println(str.substring(5,6));
        /*String str = " hello%$$%@#$%world 哈哈哈 " ;
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());*/
       /* System.out.println("hello".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(new String().isEmpty());*/
        /*System.out.println(fistUpper("yuisama"));
        System.out.println(fistUpper(""));
        System.out.println(fistUpper("a"));*/
        /*StringBuffer sb = new StringBuffer();
        sb.append("hello").append("world");
        fun(sb);
        System.out.println(sb);*/
        String s = "a";
        System.out.println(func(s));
}
    public static int func(String s) {
        char[] data = s.toCharArray();
        int start = 0;
        int i;
        for(i=0;i<s.length();i++){
            if(data[i]==' '){
                start = i+1;
            }
        }
        return i-start;
    }
    public static String fistUpper(String str) {
        if ("".equals(str)||str==null) {
            return str ;
        }
        if (str.length()>1) {
            return str.substring(0, 1).toUpperCase()+str.substring(1) ;
        }
        return str.toUpperCase() ;
    }
    public static void fun(StringBuffer temp){
        temp.append("\n").append("www.bit.com.cn");
    }
}
