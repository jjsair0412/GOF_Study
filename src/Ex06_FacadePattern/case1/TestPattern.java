package Ex06_FacadePattern.case1;

public class TestPattern {
    public static void main(String[] args){
        // 복잡하게 set을 해주었던 ComplexProduct를 직접 사용하지 않고, SimpleProduct로 한번만 호출해서 쉽게 데이터를 set해줄 수 있게 되었다.

        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("hi");
        char[] name = simpleProductFacade.getName();

        System.out.println(name[0]);
        System.out.println(name[1]);


    }
}
