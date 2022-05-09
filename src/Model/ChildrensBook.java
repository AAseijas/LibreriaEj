package Model;

import java.math.BigDecimal;

public class ChildrensBook extends Book {
    //Atributos
    private int[] rangeAge = new int[2];

    //Cosntructor
    public ChildrensBook(ClasificationBook classification, String name, int numberOfPages, BigDecimal price,int[] rangeAge){
        super(classification,name,numberOfPages,price);
        this.rangeAge=rangeAge;
    }

    //Getters & Setters

    public int getRangeAge(int age) {
        return rangeAge[age];
    }

    public void setRangeAge(int[] rangeAge) {
        this.rangeAge = rangeAge;
    }

    //Metodos


    @Override
    public String show() {
        return super.show()+" para menores entre "+this.getRangeAge(0)+" y "+this.getRangeAge(1);
    }
}
