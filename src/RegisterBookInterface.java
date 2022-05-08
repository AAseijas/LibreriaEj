import Model.Book;

import java.util.List;

public interface RegisterBookInterface {
    public void saveBook(Book bookToSave);
    public boolean deleteByTitle(String bookToDelete);
    public int getQtyLongBooks();
    public void showAll();
}
