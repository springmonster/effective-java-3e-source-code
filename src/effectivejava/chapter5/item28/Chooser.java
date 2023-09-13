package effectivejava.chapter5.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 这里有抑制警告的注释
 *   @SuppressWarnings("unchecked")
 *     public <T> T[] toArray(T[] a) {
 *         if (a.length < size)
 *             // Make a new array of a's runtime type, but my contents:
 *             return (T[]) Arrays.copyOf(elementData, size, a.getClass());
 *         System.arraycopy(elementData, 0, a, 0, size);
 *         if (a.length > size)
 *             a[size] = null;
 *         return a;
 *     }
 */
// List-based Chooser - typesafe (Page 129)
public class Chooser<T> {

  private final List<T> choiceList;

  public Chooser(Collection<T> choices) {
    choiceList = new ArrayList<>(choices);
  }

  public T choose() {
    Random rnd = ThreadLocalRandom.current();
    return choiceList.get(rnd.nextInt(choiceList.size()));
  }

  public static void main(String[] args) {
    List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);

    Chooser<Integer> chooser = new Chooser<>(intList);

    for (int i = 0; i < 10; i++) {
      Number choice = chooser.choose();
      System.out.println(choice);
    }
  }
}
