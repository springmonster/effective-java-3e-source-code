package effectivejava.chapter2.item8.examples;

public final class BookTest {

  public static void main(String[] args) {
    Book book = new Book();

    try (BookCleaner bookCleaner = new BookCleaner(book)) {
      // TODO: 2023/9/10 do nothing
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
