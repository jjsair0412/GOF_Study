package Ex03_BuilderPattern.step2;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String addressOne;
    private String addressTwo;
    private String sex;
    private boolean driverLicence;
    private boolean married;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDriverLicence(boolean driverLicence) {
        this.driverLicence = driverLicence;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public String getSex() {
        return sex;
    }

    public boolean isDriverLicence() {
        return driverLicence;
    }

    public boolean isMarried() {
        return married;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }
}
