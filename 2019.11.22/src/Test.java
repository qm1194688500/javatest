interface IShape {
    void draw();
}
class Cycle implements IShape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}
public class Test {
    public static void main(String[] args) {
        IShape shape = new Cycle();
        shape.draw();
    }
}