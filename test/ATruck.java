package test;
//载货车
public class ATruck extends Car {
    protected int ProductCount;

    public ATruck(String name, double price, int productCount) {
        super(name, price);
        ProductCount = productCount;
    }

    public int getProductCount() {
        return ProductCount;
    }

    public void setProductCount(int productCount) {
        ProductCount = productCount;
    }
}
