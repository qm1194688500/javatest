public class demo1{
    public static void main(String[] args) {
        Cat cat = new Cat("小黑");
       cat.eat("猫粮");
       Bird bird = new Bird("元元");
       Animal bird2 = new Bird("李李");//向上转型
       bird.Fly();
       //向下转型 （Bird）表示强制类型转换
       Animal animal = new Bird("yuanyuan");
       Bird bird1 = (Bird)animal;
       //instanceof 可以判定一个引用是否是某个类的实例. 如果是, 则返回 true. 这时再进行向下转型就比较安全了.
       /*
       if (animal instanceof Bird) {
        Bird bird = (Bird)animal;
        bird.fly();
        }
        */
        bird1.Fly();
    }
}

