package Ex07_DecoratorPattern.case2.decorator;

import Ex07_DecoratorPattern.case2.base.Student;

public class Science extends StudentDecorator{

    Student student;

    public Science(Student student){
        this.student= student;
    }

    @Override
    public String getDescription() {
        return student.getDescription() + " Like Science";
    }

    public void calculateStuff(){
        System.out.println("scientific calculation");
    }
}
