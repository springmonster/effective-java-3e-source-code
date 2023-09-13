package effectivejava.chapter5.item26;

import java.util.ArrayList;
import java.util.List;

// TODO: 2023/9/13 do not use!
// Fails at runtime - unsafeAdd method uses a raw type (List)!  (Page 119)
public final class Raw {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    unsafeAdd(strings, 42);
    String s = strings.get(0); // Has compiler-generated cast
  }

  private static void unsafeAdd(List list, Object o) {
    list.add(o);
  }
}

