import Model.Book;
import Model.ChildrensBook;
import Model.ClasificationBook;
import Model.TechnicalBook;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        RegisterBook register = new RegisterBook();

        Book p1 = new ChildrensBook(ClasificationBook.INFANTIL,"Test1", 152, BigDecimal.valueOf(520), new int[]{12, 26});
        Book p2 = new ChildrensBook(ClasificationBook.INFANTIL,"Test2", 252, BigDecimal.valueOf(530), new int[]{12, 14});
        Book p3 = new ChildrensBook(ClasificationBook.INFANTIL,"Test3", 452, BigDecimal.valueOf(540), new int[]{12, 18});
        Book p4 = new TechnicalBook(ClasificationBook.TECNICO,"Test4", 550, BigDecimal.valueOf(445), true);
        Book p5 = new TechnicalBook(ClasificationBook.TECNICO,"Test5", 50, BigDecimal.valueOf(445), true);
        Book p6 = new TechnicalBook(ClasificationBook.TECNICO,"Test6", 950, BigDecimal.valueOf(445), true);
        Book p7 = new TechnicalBook(ClasificationBook.TECNICO,"Test7", 350, BigDecimal.valueOf(445), true);

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
