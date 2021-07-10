package common.product;

/**
 * @author Veritas
 * @create 2021/7/8 16:24
 */
public final class RealEstateBuilder {
    private double number; //不动产总量
    private double cityNumber; //城市人口持有不动产
    private double upperNumber; //上层人口持有不动产
    private double govNumber;   //地方政府持有不动产
    private double finNumber;  //金融机构持有不动产

    private RealEstateBuilder() {
    }

    public static RealEstateBuilder aRealEstate() {
        return new RealEstateBuilder();
    }

    public RealEstateBuilder withNumber(double number) {
        this.number = number;
        return this;
    }

    public RealEstateBuilder withCityNumber(double cityNumber) {
        this.cityNumber = cityNumber;
        return this;
    }

    public RealEstateBuilder withUpperNumber(double upperNumber) {
        this.upperNumber = upperNumber;
        return this;
    }

    public RealEstateBuilder withGovNumber(double govNumber) {
        this.govNumber = govNumber;
        return this;
    }

    public RealEstateBuilder withFinNumber(double finNumber) {
        this.finNumber = finNumber;
        return this;
    }

    public RealEstate build() {
        RealEstate realEstate = new RealEstate();
        realEstate.setNumber(number);
        realEstate.setCityNumber(cityNumber);
        realEstate.setUpperNumber(upperNumber);
        realEstate.setGovNumber(govNumber);
        realEstate.setFinNumber(finNumber);
        return realEstate;
    }
}
