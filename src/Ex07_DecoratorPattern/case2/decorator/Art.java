package Ex07_DecoratorPattern.case2.decorator;

import Ex07_DecoratorPattern.case2.base.Student;

public class Art extends StudentDecorator{

    Student student;

    public Art(Student student){
        this.student = student;
    }

    @Override
    public String getDescription() {
        return student.getDescription() + " : Like ARTIST";
    }

    public void caltulateStuff(){
        System.out.println("Artist calculation");
    }
}
