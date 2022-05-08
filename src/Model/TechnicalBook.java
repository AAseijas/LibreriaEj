package Model;

import java.math.BigDecimal;

public class TechnicalBook extends Book {
    //Atributo
    private boolean extraInformation;

    //Cosntructor
    public TechnicalBook(String classification,String name, int numberOfPages, BigDecimal price, boolean extraInformation){
        super(classification,name,numberOfPages,price);
        this.extraInformation=extraInformation;
    }

    //Getters & Setters

    public boolean isExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(boolean extraInformation) {
        this.extraInformation = extraInformation;
    }

    //toString


    @Override
    public String toString() {
        return this.getClassification()+": "+this.getName()+", $"+this.getPrice()+" informacion extra: "+this.isExtraInformation();
    }
}
