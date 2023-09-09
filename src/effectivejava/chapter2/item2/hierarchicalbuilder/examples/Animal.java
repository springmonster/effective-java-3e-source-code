package effectivejava.chapter2.item2.hierarchicalbuilder.examples;

public abstract class Animal {

  private final String name;

  protected Animal(AnimalBuilder<?, ?> builder) {
    this.name = builder.name;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        '}';
  }

  /**
   * @param <T> the type of the animal
   * @param <R> the type of the builder
   */
  abstract static class AnimalBuilder<T extends Animal, R extends AnimalBuilder<T, R>> {

    private String name;

    /* Return the builder itself */
    R withName(String name) {
      this.name = name;
      return self();
    }

    /* Return the Animal */
    abstract T build();

    abstract R self();
  }
}
