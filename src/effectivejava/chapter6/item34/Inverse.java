package effectivejava.chapter6.item34;

// Switch on an enum to simulate a missing method (Page 167)
public final class Inverse {

  public static Operation inverse(Operation op) {
    return switch (op) {
      case PLUS -> Operation.MINUS;
      case MINUS -> Operation.PLUS;
      case TIMES -> Operation.DIVIDE;
      case DIVIDE -> Operation.TIMES;
      default -> throw new AssertionError("Unknown op: " + op);
    };
  }

  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    for (Operation op : Operation.values()) {
      Operation invOp = inverse(op);
      System.out.printf("%f %s %f %s %f = %f%n",
          x, op, y, invOp, y, invOp.apply(op.apply(x, y), y));
    }
  }
}
