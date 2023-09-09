package effectivejava.chapter2.item2.hierarchicalbuilder.examples;

public class AnimalTest {

  public static void main(String[] args) {
    Animal cat = new Cat.CatBuilder()
        .withName("Kitty")
        .withColor("White")
        .build();

    System.out.println(cat);

    Animal dog = new Dog.DogBuilder()
        .withName("Doggy")
        .withType("Poodle")
        .build();

    System.out.println(dog);
  }
}
