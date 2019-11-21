public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird("元元");
        feed(bird);
        Animal animal = findAnimal();
    }
    public static void feed(Animal animal){
        animal.eat("谷子");
    }
    public static Animal findAnimal(){
        Bird bird = new Bird("元元");
        return bird;
    }
}
