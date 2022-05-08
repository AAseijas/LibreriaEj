package Model;

import java.math.BigDecimal;

public abstract class Book {
    //Atributos
    private String name;
    private int numberOfPages;
    private BigDecimal price;

    private String classification;
    //Constructor
    public Book(String classification,String name, int numberOfPages, BigDecimal price) {
        this.classification=classification;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    //toString
    @Override
    abstract public String toString();

}
