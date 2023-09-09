package effectivejava.chapter2.item2.hierarchicalbuilder.examples;

public class Cat extends Animal {

  private final String color;

  private Cat(CatBuilder builder) {
    super(builder);
    this.color = builder.color;
  }

  @Override
  public String toString() {
    return super.toString() + " Cat{" +
        "color='" + color + '\'' +
        '}';
  }

  static class CatBuilder extends AnimalBuilder<Cat, CatBuilder> {

    private String color;

    @Override
    Cat build() {
      return new Cat(this);
    }

    @Override
    CatBuilder self() {
      return this;
    }

    CatBuilder withColor(String color) {
      this.color = color;
      return self();
    }
  }
}
