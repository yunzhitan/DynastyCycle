package common.pop;
import common.market.MarsMarket;
import lombok.Data;

/**
 *
 * 农民100人为一组 农民生产农产品供大家消费
 * @author Veritas
 * @create 2021/7/8 15:15
 */

@Data
public class Farmer {

    private Pop pop;
    private PopType popType = PopType.FARMER;

    private double efficiency = 1.0;  //默认生产效率为1.0

    private double produceC = 0.5;
    private double consumableC = 0.3;


    public double work() {
        int number = pop.getNumber();
        double production = number * efficiency;

        return production;
    }


    public void trade() {
        MarsMarket.sellToMars();
    }
}
