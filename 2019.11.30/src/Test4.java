public class Test4 {
    //计算字符串最后一个单词的长度，单词以空格隔开。
    public static void main(String[] args) {
        String str = "i am a student";
        String str1 = "XSUWHQ";
        System.out.println(countEndWord(str1));
        //System.out.println(countEndWord(str));
    }
    public static int countEndWord(String str){
        char[] array = str.toCharArray();
        int start = 0;
        int i ;
        for (i = 0; i <array.length ; i++) {
            if (array[i] == ' ') {
                start = i +1;
            }
        }
        return i-start;
    }
}
