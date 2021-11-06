package Ex07_DecoratorPattern.case1.base;

 // 기본이되는 추상 클래스.
public abstract class IceCream {

    protected String description = "";

    public String getDescription(){
        return this.description;
    }

    public abstract int price();
}
