public class demo1 {
    public static void main(String[] args) {
        /*StringBuilder str1 = new StringBuilder("A");
        StringBuilder str2 = new StringBuilder("B");
        int array[] = new int[10];
        System.out.println(array);
        change(str1,str2);
        System.out.println(str1+","+str2);*/
        Object o = new Object(){
            public boolean equals(Object o1){
                return true;
            }
        };
        System.out.println(o.equals("000"));
    }
    public static void change(StringBuilder x,StringBuilder y){
        x.append(y);
        y=x;
    }
}
