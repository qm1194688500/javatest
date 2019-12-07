public class Test2 {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student("张三",25);
        arr[1] = new Student("李四",22);
        arr[2] = new Student("王五",21);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
