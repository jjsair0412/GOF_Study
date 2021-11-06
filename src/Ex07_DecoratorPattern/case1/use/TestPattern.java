package Ex07_DecoratorPattern.case1.use;

import Ex07_DecoratorPattern.case1.base.IceCream;
import Ex07_DecoratorPattern.case1.base.IceCreamCake;
import Ex07_DecoratorPattern.case1.base.IceCreamCone;
import Ex07_DecoratorPattern.case1.decorator.Melon;
import Ex07_DecoratorPattern.case1.decorator.Strawberry;

public class TestPattern {
    public static void main(String[] args){
        // 데코레이션을 사용하지 않고 기존의 객체를 생성하는 방식처럼 사용한 IceCream1
        IceCream iceCream1 = new IceCreamCone();
        System.out.println(iceCream1.getDescription() + " cost : "+iceCream1.price());

        // 데코레이션을 사용해서 기본 IceCream이라는곳에 메론이나 딸기와같은 클래스들을 첨가해서 사용한 얘제
        IceCream iceCream2 = new IceCreamCake();
        iceCream2 = new Strawberry(iceCream2);
        System.out.println(iceCream2.getDescription() + " cost : "+iceCream2.price());

        IceCream iceCream3 = new IceCreamCone();
        iceCream3 = new Melon(iceCream3);
        System.out.println(iceCream3.getDescription() + " cost : "+iceCream3.price());
    }
}
