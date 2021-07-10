package common.market;

import common.product.ProductType;
import util.concurrent.NonBlockingHashMap;

import java.util.Map;

/**
 * 万能的火星市场，接受一切货物
 * @author Veritas
 * @create 2021/7/9 13:43
 */
public class MarsMarket {

    private volatile Map<ProductType,Double> map = new NonBlockingHashMap();

    public void sellToMars(ProductType productType, double production) {
        map.put(productType,production);
    }
}
