package Ex06_FacadePattern.case1;

public class ComplexProduct {
    char[] nameChars = new char[3];
    public ComplexProduct(){

    }
    public void setFirstName(char c){
        nameChars[0] = c;
    }
    public void setSecondName(char c){
        nameChars[1] = c;
    }
    public void setThirdName(char c){
        nameChars[2] = c;
    }
    public char[] getName(){
        return nameChars;
    }
}
