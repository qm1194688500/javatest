class exchange{
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }
}
public class demo4 {
    public static void main(String[] args) {
        exchange x = new exchange();
        x.setNum1(1);
        x.setNum2(2);
        System.out.println(x.getNum1());
        System.out.println(x.getNum2());
        int temp = x.getNum1();
        x.setNum1(x.getNum2());
        x.setNum2(temp);
        System.out.println(x.getNum1());
        System.out.println(x.getNum2());
    }
}
