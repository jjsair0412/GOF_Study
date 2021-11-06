package Ex07_DecoratorPattern.case2.base;
// 기본이되는 추상 클래스.
// 기본이 되는 클래스는 일반 클래스이거나 추상 클래스일 수 있다.
public abstract class Student {
    protected String description = "no particular";

    public String getDescription(){
        return description;
    }
}
