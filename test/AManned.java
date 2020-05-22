package test;
//载人汽车
public class AManned extends Car {
    protected int personCount;

    public AManned(String name, double price, int personCount) {
        super(name, price);
        this.personCount = personCount;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }
}
