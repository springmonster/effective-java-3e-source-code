package effectivejava.chapter2.item3.enumtype.examples;

public enum Person {
  INSTANCE;

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm outta here!");
  }
}
