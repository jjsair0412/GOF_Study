package Ex03_BuilderPattern.step2;

import java.time.LocalDate;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String addressOne;
    private String addressTwo;
    private String sex;
    private boolean driverLicence;
    private boolean married;

    // 빌더패턴을 적용하기위해서 setter만 필요하다.
    // 그 후 setter의 반환타입을 자신의 클래스로 두고, this를 반환하게끔 수정한다.
    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;

    }

    public PersonBuilder setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;

    }

    public PersonBuilder setAddressOne(String addressOne) {
        this.addressOne = addressOne;
        return this;

    }

    public PersonBuilder setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
        return this;

    }

    public PersonBuilder setSex(String sex) {
        this.sex = sex;
        return this;

    }

    public PersonBuilder setDriverLicence(boolean driverLicence) {
        this.driverLicence = driverLicence;
        return this;
    }

    public PersonBuilder setMarried(boolean married) {
        this.married = married;
        return this;

    }

    public Person build(){
        Person person = new Person();
        person.setAddressOne(addressOne);
        person.setDriverLicence(driverLicence);
        person.setAddressTwo(addressTwo);
        person.setFirstName(firstName);
        person.setSex(sex);
        person.setMarried(married);
        person.setLastName(lastName);
        return person;
    }
}
