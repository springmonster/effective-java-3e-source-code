package effectivejava.chapter2.item2.builder;

public class Person {

  private final String name;
  private final int age;
  private final String hobby;
  private final String address;
  private final String phone;

  private Person(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.hobby = builder.hobby;
    this.address = builder.address;
    this.phone = builder.phone;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", hobby='" + hobby + '\'' +
        ", address='" + address + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }

  static class Builder {

    private final String name;
    private final int age;

    private String hobby;
    private String address;
    private String phone;

    Builder(String name, int age) {
      this.name = name;
      this.age = age;
    }

    Builder hobby(String hobby) {
      this.hobby = hobby;
      return this;
    }

    Builder address(String address) {
      this.address = address;
      return this;
    }

    Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    Person build() {
      return new Person(this);
    }
  }
}
