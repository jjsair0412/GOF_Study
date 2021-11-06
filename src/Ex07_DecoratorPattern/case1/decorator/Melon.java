package Ex07_DecoratorPattern.case1.decorator;

import Ex07_DecoratorPattern.case1.base.IceCream;

public class Melon extends Decorator{

    IceCream iceCream;

    public Melon(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int price() {
        return 300 +  iceCream.price();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + 메론";
    }
}
