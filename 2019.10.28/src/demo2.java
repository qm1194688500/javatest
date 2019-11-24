class Calculator{
    private int num1;
    private int num2;
    public int Add(int num1,int num2){
        return num1+num2;
    }
    public int Red(int num1,int num2){
        return num1-num2;
    }
    public int Mul(int num1,int num2){
        return num1*num2;
    }
    public int Div(int num1,int num2){
        return num1/num2;
    }
}
public class demo2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int a=c.Add(1,2);
        System.out.println(a);
    }
}
