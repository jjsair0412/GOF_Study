package Ex07_DecoratorPattern.case1.base;

 // 기본인 IceCream을 상속받아서 사용한 기본 IceCreamCone 클래스
public class IceCreamCone extends IceCream{
    public IceCreamCone(){
        this.description = "아이스크림 콘";
    }

    @Override
    public int price() {
        return 1200;
    }
}
