package effectivejava.chapter2.item8.examples;

public class Book implements Runnable {

  public Book() {
    System.out.println("Book is created");
  }

  @Override
  public void run() {
    System.out.println("Book is running");
  }
}
