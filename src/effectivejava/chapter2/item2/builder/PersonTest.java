package effectivejava.chapter2.item2.builder;

public class PersonTest {

  public static void main(String[] args) {
    Person person = new Person.Builder("John", 30)
        .address("1234 Main St")
        .phone("123-456-7890")
        .hobby("Soccer")
        .build();
    System.out.println(person);
  }
}
