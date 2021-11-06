package Ex07_DecoratorPattern.case1.base;

 // 기본을 상속받아서 만들어진 기본 IceCreamCake
public class IceCreamCake extends IceCream{

    public IceCreamCake(){
        this.description = "아이스크림 케이크";
    }

    @Override
    public int price() {
        return 1500;
    }
}
