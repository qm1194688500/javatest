class Phone{
    private String brand;
    private int price;
   public Phone(){} //空参构造
   public Phone(String brind,int price){
       this.brand=brind;
       this.brand=brind;
   }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void show(){
        System.out.println("brand:" + brand+ "price:" + price);
    }
}
public class demo3 {
    public static void main(String[] args) {
        Phone p1 = new Phone("苹果",5000);//有参的构造
        p1.show();
        Phone p2 = new Phone();
        p2.setBrand("小米");
        p2.setPrice(500);
        p2.show();
    }
}
