package Ex07_DecoratorPattern.case1.decorator;

import Ex07_DecoratorPattern.case1.base.IceCream;

// 첨가물을 나타내는 추상클래스 ( decorator 클래스 )
// 데코레이터 클래스의 형식은, 그 클래스가 감싸고 있는 클래스의 형식을 반영한다.
// IceCream 객체가 들어갈 자리에 들어갈 수 있어야 하기 때문에 IceCream 클래스를 상속한다.

public abstract class Decorator extends IceCream {


    public abstract String getDescription();
    // 비용은 이미 추상 메서드기때문에 서브클래스에서 꼭 구현해야 한다.
}
