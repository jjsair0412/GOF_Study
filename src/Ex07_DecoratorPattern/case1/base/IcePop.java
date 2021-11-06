package Ex07_DecoratorPattern.case1.base;

 // 기본 IceCream을 상속받아서 만든 기본 IcePop
public class IcePop extends IceCream{

    public IcePop(){
        this.description = "아이스크림 막대(바)";
    }

    @Override
    public int price() {
        return 1000;
    }
}
