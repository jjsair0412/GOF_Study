package Ex03_BuilderPattern.step2;

public class TestPattern {
    public static void main(String[] args) {
        Person p1 = Person.builder() // PersonBuilder가 반환됨
                .setAddressTwo("1") // 여기서부터는 PersonBuilder의 setter 메서드들이다.
                .setMarried(true)
                .setFirstName("주진성")
                .setLastName("주진성마지막이름")
                .setAddressOne("2")
                .setDriverLicence(true)
                .setSex("남자")
                .build();
        System.out.println("p1.getFirstName() = " + p1.getFirstName());
    }

}
