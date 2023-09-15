package effectivejava.chapter8.item49;

import java.util.Objects;

public final class NoNull {

  public static void main(String[] args) {
    Objects.requireNonNull(args[0]);
    Objects.requireNonNull(args[1], "args[1] is null");
    Objects.requireNonNull(args[2], () -> "args[2] is null");
  }
}
