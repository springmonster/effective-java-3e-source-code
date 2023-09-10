package effectivejava.chapter2.item8;

// Well-behaved client of resource with cleaner safety-net (Page 33)
public final class Adult {

  public static void main(String[] args) {
    try (Room myRoom = new Room(7)) {
      System.out.println("Goodbye");
    }
  }
}
