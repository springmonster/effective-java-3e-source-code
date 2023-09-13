package effectivejava.chapter5.item33;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

// Use of asSubclass to safely cast to a bounded type token (Page 155)
public final class PrintAnnotation {

  static Annotation getAnnotation(AnnotatedElement element,
      String annotationTypeName) {
    Class<?> annotationType; // Unbounded type token
    try {
      annotationType = Class.forName(annotationTypeName);
    } catch (Exception ex) {
      throw new IllegalArgumentException(ex);
    }
    Class<? extends Annotation> subclass = annotationType.asSubclass(Annotation.class);
    System.out.println(subclass);

    Annotation annotation = element.getAnnotation(subclass);
    System.out.println(annotation);

    return annotation;
  }

  // Test program to print named annotation of named class
  public static void main(String[] args) throws Exception {
//    if (args.length != 2) {
//      System.out.println(
//          "Usage: java PrintAnnotation <class> <annotation>");
//      System.exit(1);
//    }
//    String className = args[0];
    String className = "effectivejava.chapter5.item33.Test";
//    String annotationTypeName = args[1];
    String annotationTypeName = "java.lang.Override";
    Class<?> klass = Class.forName(className);
    System.out.println(getAnnotation(klass, annotationTypeName));
  }
}
