public class test {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        boolean b;
        b=x>50&&y>60||x>50&&y<-60&&y>60||x<-50&&y<-60;
        System.out.println(b);
    }
}
