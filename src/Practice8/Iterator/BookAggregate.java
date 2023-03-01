package Practice8.Iterator;

public class BookAggregate implements Aggregate<Book>{
    private Book[] books;

    public BookAggregate(Book[] books)
    {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }
}
