/*
 *from: The Java Language Specification - Java SE 8 Edition (2015-02-13)
 * pag. 353: Example 11.3-1. Throwing and Catching Exceptions
 * 1) import  test01.java in JStruct
 * 2) export from JSTRUCT in test01_a.java
 * 3) compare/compile test01.java and test01_a.java
 */

class TestException extends Exception {
   TestException() { super(); }
   TestException(String s) { super(s); }
   }
/*
 * note: use one or more arguments in command line
 * from: "divide", "null", "test".
 */
class Test {
    public static void main(String[] args) {
       System.out.println("Test Throwing and Catching Exceptions");
       for (String arg : args) {
            try {
                thrower(arg);
                System.out.println("Test \"" + arg + "\" didn't throw an exception");
                }
            catch (Exception e) {
                System.out.println("Test \"" + arg + "\" threw a " + e.getClass() +
                  "\n with message: " +e.getMessage());
                }
            }
         }
    static int thrower(String s) throws TestException {
        // note: try but no catch
        try {
            if (s.equals("divide")) {
                int i = 0;
                return i/i;
                }
            if (s.equals("null")) {
                s = null;
                return s.length();
                }
            if (s.equals("test")) {
                throw new TestException("Test message");
                }
            return 0;
            }
        finally {
            System.out.println("[thrower(\"" + s + "\") done]");
            }
        }
    }
