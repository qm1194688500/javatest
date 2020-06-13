package frank.model;

public class DuckFactory {
    public static Duck create(){
        Duck d = new Duck();
        d.setName("xiucai");
        d.setAge(3);
        return d;
    }
    public Duck createBean(){
        return new Duck("haha",10);
    }
}
