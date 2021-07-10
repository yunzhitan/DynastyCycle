package common.pop;

import lombok.Data;

/**
 * @author Veritas
 * @create 2021/7/8 15:06
 *
 * Pop是人口的统计信息
 */

@Data
public class Pop {

    private int number; //人口总量
    private double asset = 10; //人口持有资产
    private double debt = 0;  //人口持有负债
    private double income = 0; //人口日收入
    private double outcome = 0; //人口日支出

}
