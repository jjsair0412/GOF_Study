package Ex07_DecoratorPattern.case1.decorator;

import Ex07_DecoratorPattern.case1.base.IceCream;

// StrawBerry는 데코레이터기 때문에 Decorator를 상속한다.
public class Strawberry extends Decorator{

    // Wrapping 하고자 하는 음료를 저장하기위한 인스턴스 변수
    IceCream iceCream;

    public Strawberry(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + 딸기";
    }

    @Override
    public int price() {
        return 500 + iceCream.price();
    }
}
