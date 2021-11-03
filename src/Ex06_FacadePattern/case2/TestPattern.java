package Ex06_FacadePattern.case2;

public class TestPattern {
    public static void main(String[] args){
        HomeFacade homeFacade = new HomeFacade(new Computer(), new Light(), new Radio());
        homeFacade.HomeIn();
        homeFacade.HomeOut();
    }
}
