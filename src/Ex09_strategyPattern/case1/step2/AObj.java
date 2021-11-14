package Ex09_strategyPattern.case1.step2;

public class AObj {

    BInterface bInterface;

    public AObj(){
        bInterface = new BImplement();
    }

    public void SomeFunc(){
        bInterface.FuncA();
        bInterface.FuncA();
    }
}
