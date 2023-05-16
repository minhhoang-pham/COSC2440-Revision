package SampleTest.Problem2;

import java.util.ArrayList;
import java.util.List;

public class BookInventory {
    private List<Book> bookList;

    public BookInventory() {
        this.bookList = new ArrayList<>();
    }

    /**
     * Add a book to the list of books
     * @param bookName Name of the book
     * @param quantity Quantity to add
     */
    public void addBook(String bookName, int quantity) {
        bookList.add(new Book(bookName, quantity));
    }

    /**
     * Remove a certain number of books from the list
     * @param bookName Name of the book
     * @param quantity Quantity to remove
     */
    public void removeBook(String bookName, int quantity) {
//        Traverse through the arrayList of books
        for (Book book : bookList) {
//            Look for the book name within the list
            if (book.getName().equals(bookName)) {
//                Check if the quantity is less than the quantity the user wants to remove
                if (book.getQuantity() < quantity) {
//                    Throw exception if there isn't enough
                    throw new RuntimeException("Not enough books");
                } else {
//                    Subtract the amount of books from input
                    book.setQuantity(book.getQuantity() - quantity);
                }
            }
        }
    }

    public int getBookQuantity(String bookName) {
//        Traverse through book arrayList
        for (Book book : bookList) {
//            Find the book name and return its quantity
            if (book.getName().equals(bookName)) {
                return book.getQuantity();
            }
        }
//        If nothing is found then return 0
        return 0;
    }
}
