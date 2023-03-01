package Practice8.Iterator;

public class BookIterator implements Iterator<Book> {
    private Book[] books;
    private int position;

    public BookIterator(Book[] topics) {
        this.books = topics;
        position = 0;
    }

    @Override
    public Book next() {
        return books[position++];
    }

    @Override
    public boolean hasNext() {
        if (position >= books.length)
            return false;
        return true;
    }
}
