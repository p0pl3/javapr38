package Practice8.Iterator;

public class Test {
    public static void main(String[] args)
    {
        Book[] books = new Book[5];
        books[0] = new Book("topic1");
        books[1] = new Book("topic2");
        books[2] = new Book("topic3");
        books[3] = new Book("topic4");
        books[4] = new Book("topic5");

        Aggregate<Book> aggregate = new BookAggregate(books);

        Iterator<Book> iterator = aggregate.iterator();

        while(iterator.hasNext()) {
            Book currentBook = iterator.next();
            System.out.println(currentBook.getName());
        }
    }
}
