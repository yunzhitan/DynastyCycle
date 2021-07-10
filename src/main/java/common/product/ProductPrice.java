package common.product;

import lombok.Data;

/**
 * 产品价格
 * @author Veritas
 * @create 2021/7/8 18:18
 */
@Data
public class ProductPrice {

    private static double producePrice; //农产品价格
    private static double mineralPrice; //矿产品价格
    private static double consumablePrice; //消费品价格
    private static double industrialPrice; //工业品价格

    public static double getProductPrice(ProductType productType) {

        double price = switch (productType) {
            case PRODUCE -> producePrice;
            case MINERAL -> mineralPrice;
            case CONSUMABLE -> consumablePrice;
            case INDUSTRIAL -> industrialPrice;
        };

        return price;
    }

}
