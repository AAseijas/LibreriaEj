package Model;

import java.math.BigDecimal;

public  class Book {
    //Atributos
    private String name;
    private int numberOfPages;
    private BigDecimal price;
    private ClasificationBook classification;

    //Constructor

    public Book(ClasificationBook classification,String name, int numberOfPages, BigDecimal price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.classification = classification;
    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ClasificationBook getClassification() {
        return classification;
    }

    public void setClassification(ClasificationBook classification) {
        this.classification = classification;
    }



     public String show(){
         return this.getClassification()+": "+this.getName()+", $"+this.getPrice();
     };

}
