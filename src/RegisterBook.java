import Model.Book;

import java.util.ArrayList;
import java.util.List;

public class RegisterBook implements RegisterBookInterface {

    //Atributos
    private List<Book> booksList = new ArrayList<>();
    //Creo esta lista para guardare los nombres de los libros, dado que la lista de bookLIst almacena objetos.
    private List<String> bookNamesList = new ArrayList<>();


    //Getters & Setters
    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    public List<String> getBookNamesList() {
        return bookNamesList;
    }

    public void setBookNamesList(List<String> bookNamesList) {
        this.bookNamesList = bookNamesList;
    }

    //Metodos

    @Override
    public void saveBook(Book bookToSave) {
        if (bookNamesList.size() == 0) {
            booksList.add(bookToSave);
            bookNamesList.add(bookToSave.getName());
        } else {
            if (bookNamesList.contains(bookToSave.getName()) == false) {
                booksList.add(bookToSave);
                bookNamesList.add(bookToSave.getName());
            } else {
                System.out.println("No se puede guardar el libro " + bookToSave.getName() + " ya existe");
            }
        }
    }

    @Override
    public boolean deleteByTitle(String bookToDelete) {
        /**
         * Como la lista bookList y bookNameList almacena en el mismo orden los libros. Obtengo de la lista de bookNameList el indice del libro
         * a eliminar. Utilizo esta dado que la lista bookList almacena objeto y encontrar el indice es mucho mas dificil y costoso que en una lista de
         * solamente nombres.
         * **/
        int indexBook = bookNamesList.indexOf(bookToDelete);

        if (bookNamesList.contains(bookToDelete)) {
            booksList.remove(indexBook);
            bookNamesList.remove(indexBook);
        } else {
            System.out.println("No se puede eliminar el libro " + bookToDelete + " no existe");
        }
        return false;
    }

    @Override
    public int getQtyLongBooks() {
        int qtyBooks = 0;
        for (int i=0; i<booksList.size();i++){
            Book book = booksList.get(i);
            if (book.getNumberOfPages()>500){
                qtyBooks++;
            }
        }
        return qtyBooks;
    }

    @Override
    public void showAll() {
        for (int i = 0; i < booksList.size(); i++) {
            System.out.println(booksList.get(i));
        }
    }
}
