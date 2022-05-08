import Model.Book;
import Model.ChildrensBook;
import Model.TechnicalBook;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        RegisterBook register = new RegisterBook();

        int[] rangeAge = {12, 22};

        Book p1 = new ChildrensBook("INFANTIL","Test1", 152, BigDecimal.valueOf(520), rangeAge);
        Book p2 = new ChildrensBook("INFANTIL","Test2", 252, BigDecimal.valueOf(530), rangeAge);
        Book p3 = new ChildrensBook("INFANTIL","Test3", 452, BigDecimal.valueOf(540), rangeAge);
        Book p4 = new TechnicalBook("TECNICO","Test4", 550, BigDecimal.valueOf(445), true);
        Book p5 = new TechnicalBook("TECNICO","Test5", 50, BigDecimal.valueOf(445), true);
        Book p6 = new TechnicalBook("TECNICO","Test6", 950, BigDecimal.valueOf(445), true);
        Book p7 = new TechnicalBook("TECNICO","Test7", 350, BigDecimal.valueOf(445), true);

        register.saveBook(p1);
        register.saveBook(p2);
        register.saveBook(p3);
        register.saveBook(p4);
        register.saveBook(p5);
        register.saveBook(p6);
        register.saveBook(p7);

        register.showAll();

        System.out.println("La cantidad de libros extensos: "+register.getQtyLongBooks());

        register.deleteByTitle("Test4");

        register.showAll();

    }
}
