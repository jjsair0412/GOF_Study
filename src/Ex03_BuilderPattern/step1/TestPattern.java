package Ex03_BuilderPattern.step1;

public class TestPattern {
    public static void main(String[] args) {
        Person p1 = createPersonForTesting();
        System.out.println("p1.getFirstName() = " + p1.getFirstName());
    }

    public static Person createPersonForTesting() {
        Person person = new Person();
        person.setAddressOne("Address1");
        person.setDriverLicence(false);
        person.setAddressTwo("Address2");
        person.setFirstName("Ju");
        person.setSex("Man");
        person.setMarried(true);
        person.setLastName("JinSoung");
        // ... 이렇게 맴버변수가 많으면 많을수록 값을 세팅하기가 너무어렵다.
        // 어디까지 집어넣은지도 일일히 확인해야되고, 보기에도 좋지않기때문이다.
        return person;
    }
}
