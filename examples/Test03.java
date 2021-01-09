/*
 *from: The Java ® Language Specification - Java SE 8 Edition
 * (2015-02-13)
 * pag. 423
 * 1) import  test03.java in JStruct
 * 2) export from JSTRUCT in test03_a.java
 * 3) compare/compile test03.java and test03_a.java
 */

class Test03 {
    public static void main(String[] args) {
        Baz.testAsserts();
        // Will execute after Baz is initialized.
        assert false : "test: assert enabled";
        }
     }
class Bar {
        static {
            Baz.testAsserts();
            // Will execute before Baz is initialized!
        }
    }
class Baz extends Bar {
    static void testAsserts() {
        boolean enabled = false;
        assert enabled = true;
        System.out.println("Asserts " +
        (enabled ? "enabled" : "disabled"));
        }
    }