package entity;

import lombok.Data;

@Data
public class Goods {
    private Integer id;
    private String name;
    private String introduce;
    private Integer stock;
    private String unit;
    private Integer price;
    private Integer discount;
    private Integer buyGoodsNum;

    public double getPrice() {
        return price * 1.0 / 100;
    }
    //这个是返回整数的价格
    public int getPriceInt() {
        return price;
    }
}
