package Ex06_FacadePattern.case1;

public class SimpleProductFacade {
    ComplexProduct complexProduct;
    public SimpleProductFacade(){
        complexProduct = new ComplexProduct();
    }

    public void setName(String n){
        char[] chars = n.toCharArray();

        if(chars.length>0){
            complexProduct.setFirstName(chars[0]);
        }
        if(chars.length>1){
            complexProduct.setSecondName(chars[1]);
        }
        if(chars.length>2){
            complexProduct.setThirdName(chars[2]);
        }
    }
    public char[] getName(){
        return complexProduct.getName();
    }
}
