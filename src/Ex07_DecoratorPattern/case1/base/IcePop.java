package Ex07_DecoratorPattern.case1.base;

public class IcePop extends IceCream{

    public IcePop(){
        this.description = "아이스크림 막대(바)";
    }

    @Override
    public int price() {
        return 1000;
    }
}
