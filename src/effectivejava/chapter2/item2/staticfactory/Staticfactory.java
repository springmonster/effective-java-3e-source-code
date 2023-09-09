package effectivejava.chapter2.item2.staticfactory;

/**
 * <p>
 * from——A 类型转换方法，它接受单个参数并返回此类型的相应实例，例如：Date d = Date.from(instant);
 * </p>
 * <p>
 * of——一个聚合方法，接受多个参数并返回该类型的实例，并把他们合并在一起，例如：Set faceCards = EnumSet.of(JACK, QUEEN, KING);
 * </p>
 * <p>
 * valueOf——from 和 to 更为详细的替代 方式，例如：BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
 * </p>
 * <p>
 * instance 或 getInstance——返回一个由其参数 (如果有的话) 描述的实例，但不能说它具有相同的值，例如： StackWalker luke =
 * StackWalker.getInstance(options);
 * </p>
 * <p>
 * create 或 newInstance——与 instance 或 getInstance 类似，除了该方法保证每个调用返回一个新的实例，例如： Object newArray =
 * Array.newInstance(classObject, arrayLen);
 * </p>
 * <p>
 * getType——与 getInstance 类似，但是如果在工厂方法中不同的类中使用。 Type 是工厂方法返回的对象类型，例
 * 如：{@code FileStore fs = Files.getFileStore(path);}
 * </p>
 * <p>
 * newType——与 newInstance 类似，但是如果在工厂方法中不同的类中使用。Type 是工厂方法返回的对象类型，
 * 例如：{@code BufferedReader br = Files.newBufferedReader(path); }
 * </p>
 * <p>
 * type—— getType 和 newType 简洁的替代方式，例如：List litany = Collections.list(legacyLitany);
 * </p>
 */
public class Staticfactory {

}
