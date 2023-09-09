package effectivejava.chapter2.item2.hierarchicalbuilder.examples;

public class Dog extends Animal {

  private final String type;

  private Dog(DogBuilder builder) {
    super(builder);
    this.type = builder.type;
  }

  @Override
  public String toString() {
    return super.toString() + " Dog{" +
        "type='" + type + '\'' +
        '}';
  }

  static class DogBuilder extends AnimalBuilder<Dog, DogBuilder> {

    private String type;

    @Override
    Dog build() {
      return new Dog(this);
    }

    @Override
    DogBuilder self() {
      return this;
    }

    DogBuilder withType(String type) {
      this.type = type;
      return self();
    }
  }
}
