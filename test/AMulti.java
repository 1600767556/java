package test;
//载人加载货车
public class AMulti extends Car {

    protected int productCount;
    protected int personCount;

    public AMulti(String name, double price, int productCount, int personCount) {
        super(name, price);
        this.productCount = productCount;
        this.personCount = personCount;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }
}
