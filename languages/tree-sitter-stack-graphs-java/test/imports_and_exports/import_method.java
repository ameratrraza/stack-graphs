/*--- path: Importer.java ---*/
import foo.Foo;

public class Importer {
  public static void main(String[] args) {
    Foo.bar();
 // ^ defined: 2,15
     // ^ defined: 16

  }
}

/* --- path: foo/Foo.java ---*/

public class Foo {
  public static void bar() {
  }
}
