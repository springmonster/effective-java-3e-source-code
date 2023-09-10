package effectivejava.chapter2.item8.examples;

import java.lang.ref.Cleaner;
import java.lang.ref.Cleaner.Cleanable;

public class BookCleaner implements AutoCloseable {

  private final Cleaner cleaner = Cleaner.create();
  private final Cleanable cleanable;

  public BookCleaner(Book book) {
    cleanable = this.cleaner.register(this, book);
  }

  @Override
  public void close() {
    // when the object is eligible for gc, the clean method will be invoked
    // it will invoke the run method of the book
    this.cleanable.clean();
  }
}
