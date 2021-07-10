package common.financial;

import lombok.Data;

/**
 * @author Veritas
 * @create 2021/7/8 19:22
 */
@Data
public class FarmerFinancial {

    FarmerIncome income;
    FarmerOutcome outcome;
    FarmerAsset asset;
    FarmerDebt debt;


    class FarmerIncome {
        double farmIncome; //农业收入
        double savingInt; //储蓄利息
        double bondInt; //债券利息
        double shareDividend; //股票分红
        double consumerLoan; //获得消费贷款
        double investmentLoan; //获得投资贷款
        double sellShare;     //卖出股票
        double sellBond;     //卖出债券
        double sellFarm;     //卖出农田

        public double getIncome() {
            return farmIncome + savingInt + bondInt + shareDividend
                    +consumerLoan + investmentLoan + sellShare
                    +sellBond + sellFarm;
        }

        public double getAssetIncome() {
            return sellBond + sellShare + sellFarm;
        }

        @Override
        public String toString() {
            return "FarmerIncome{" +
                    "farmIncome=" + farmIncome +
                    ", savingInt=" + savingInt +
                    ", bondInt=" + bondInt +
                    ", shareDividend=" + shareDividend +
                    ", consumerLoan=" + consumerLoan +
                    ", investmentLoan=" + investmentLoan +
                    ", sellShare=" + sellShare +
                    ", sellBond=" + sellBond +
                    ", sellFarm=" + sellFarm +
                    '}';
        }
    }

    class FarmerOutcome {
        double tax; //税收支出
        double profitTax; //利得税支出
        double landRent;  //地租支出
        double debt;      //债务支出
        double necessity; //必需品支出
        double consumption; //消费支出
        double payDebt;   //偿还债务
        double purseShare; //股票支出
        double purseBond;  //债券支出
        double purseFarm;  //农田支出

        @Override
        public String toString() {
            return "FarmerOutcome{" +
                    "tax=" + tax +
                    ", profitTax=" + profitTax +
                    ", landRent=" + landRent +
                    ", debt=" + debt +
                    ", necessity=" + necessity +
                    ", consumption=" + consumption +
                    ", payDebt=" + payDebt +
                    ", purseShare=" + purseShare +
                    ", bondShare=" + purseBond +
                    ", farmShare=" + purseFarm +
                    '}';
        }

        public double getOutcome() {
            return tax + profitTax + landRent + debt + necessity +consumption
                    + payDebt +purseShare + purseBond + purseFarm;
        }

        public double getAssetOutcome() {
            return purseShare + purseBond + purseFarm;
        }
    }

    class FarmerAsset {
        double cash;    //现金
        double saving;  //储蓄
        double farm;    //农田
        double bond;    //债券
        double share;   //股票

        public double getAsset() {
            return cash + saving + farm + bond + share;
        }

        @Override
        public String toString() {
            return "FarmerAsset{" +
                    "cash=" + cash +
                    ", saving=" + saving +
                    ", farm=" + farm +
                    ", bond=" + bond +
                    ", share=" + share +
                    '}';
        }
    }

    class FarmerDebt {

        double debt;

        public double getDebt() {
            return debt;
        }

        @Override
        public String toString() {
            return "FarmerDebt{" +
                    "debt=" + debt +
                    '}';
        }
    }
}
