package effectivejava.chapter2.item9.trywithresources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// TODO: 2023/9/10 Best way to close resources!
public final class Copy {

  private static final int BUFFER_SIZE = 8 * 1024;

  // try-with-resources on multiple resources - short and sweet (Page 35)
  static void copy(String src, String dst) throws IOException {
    // try-with-resources on multiple resources - short and sweet
    try (InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst)) {
      byte[] buf = new byte[BUFFER_SIZE];
      int n;
      while ((n = in.read(buf)) >= 0) {
        out.write(buf, 0, n);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    String src = args[0];
    String dst = args[1];
    copy(src, dst);
  }
}
