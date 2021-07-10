package common.product;

import lombok.Data;
import lombok.Setter;

/**
 * @author Veritas
 * @create 2021/7/8 16:16
 */

@Data
public class RealEstate {

    private double number; //不动产总量

    private double cityNumber; //城市人口持有不动产

    private double upperNumber; //上层人口持有不动产

    private double govNumber;   //地方政府持有不动产

    private double finNumber;  //金融机构持有不动产

    private double price;  //不动产单价

    private double priceChange = 0; //不动产价值变化


    @Override
    public String toString() {
        return "RealEstate{" +
                "number=" + number +
                ", cityNumber=" + cityNumber +
                ", upperNumber=" + upperNumber +
                ", govNumber=" + govNumber +
                ", finNumber=" + finNumber +
                '}';
    }

}
