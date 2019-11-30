public class Test3 {
    public static void reverse(char[] array,int left,int right) {
        while (left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static String reverseSentence(String str) {
        char[] array = str.toCharArray();
        reverse(array,0,array.length-1);
        int start = 0;
        //单词逆置
        for(int i = 1;i < array.length;i++) {
            if(array[i] == ' ') {
                reverse(array,start,i-1);
                start = i+1;
            }
        }
        return String.valueOf(array);

    }

    public static void main(String[] args) {
        String ret = reverseSentence("i am student");
        System.out.println(ret);
    }
}
