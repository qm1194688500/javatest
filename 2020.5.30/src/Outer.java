
public class Outer
{
    int x=3;
    public void function()//可调用函数
    {
        new AbsDemo()//匿名内部类
        {
            void show()
            {
                System.out.println("x==="+x);
            }
            void abc()
            {
                System.out.println("haha");
            }
        }.abc();  //匿名内部类调用函数,匿名内部类方法只能调用一次
    }
}
