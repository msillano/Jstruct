//@source: D:\User\Documents\progetti2015\javaStruct\examples\FullUserTest\FullUserTest.nsd
//@JStruct: 1.02.01 SAXParser: com.sun.org.apache.xerces.internal.jaxp.SAXParserImpl 1.8
//@JStructOptions:ADDJAVADOC,ADDJAVADOCPUBLIC,PROGRAMDOCONTOP
// package and import
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *test class for JStruct.
 *This show styles and limits of code insert.
 *<h3>General rules </h3>
 *<li> Sequences blocks allow multiline code, ";" mandatory for all but last line.
 *<li> Text in "comments" area: for Classes and Methods it is set for javadoc.
 *<li> Text in "comments" area: line lenght limited to this ===============|
 *<li> "/*  * /" and "//" are allowed in Sequences code in almost any place.
 *<li> Conditions can be splitted in multilines; comments not allowed in conditions.
 *<li> User/local keywords (in menu:Options:Parser) for i/o are mandatories, other
 *optionals.
 *<li> Code fallows standard Java syntax (exception: i/o parenthesis use),
 *<li> Top level are Classes o Methods (special button to create).
 *<li> Classes can contain Classes or Methods
 *<h3>More rules </h3>
 *See blocks comments in JStruct using <b>menu:Diagram:show comments F2</b><br>
 *
 * @version 1.00.00  build 23  (2015.03.11-19:05:31)
 * @author m.s.
 */
   public class FullUserTest
   extends Object {

      /* class global variables */
      static final int MAX = 40;
      /* == SEE COMMENTS == */

/**
 *test for elements and syntax.
 *
 *This code is crazy: only a collection of test cases.
 *The java exporteted code MUST compile whitout errors.
 *note: Only the main() method declaration can be short as here ('main').
 */
      public static void main(String[] args) {
//Input rules (see menu:Options:Parser:Input):
//  <inputLocal> <strVar>;
// - "input" using console, no Parenthesis.
//   (implementation: (new Scanner(System.in)).nextLine )
//
//  <strVar> = <inputLocal> [(] <prompMessaget> [)] ;
// - "input" as pop-up: use Parenthesis.
//   (implementation: JOptionPane.showInputDialog )
//
// - "input" returns always a String.
         String s = JOptionPane.showInputDialog("Insert a number " + '\u00BB');
         int variabile1 = 0;
         try {
//from String to Int, can Trows Exception.
            variabile1 = Integer.parseInt(s);
         }
         catch (NumberFormatException e) {
//Output rules (see menu:Options:Parser:Output):
//  <outputLocal> <message>
// - "Output" a String using console: no Parenthesis.
//    (implementation: System.out.println())
//  <outputLocal> ( <message> )
// - "Output" a String in pop-up: use Parenthesis.
//    (implementation: try-catch block and JOptionPane.showMessageDialog)
            System.out.println(e);
         }
         finally {
            // nothing to do
         }
         String t;
//test: code line splitted
//Input as standard pop-up, message as parameter.
         t = JOptionPane.showInputDialog("Please input a value");
// test: for spaces in strings.
// output in console (not parenthesis)
         System.out.println("Insert   N\u00BA  " + "1         number:");
//test: math
         variabile1 += variabile1 / 3;
//Uses console (no parenthesis).
//Reads a String.
         String u;
         u = (new Scanner(System.in)).nextLine();
//test: not special keywords
// - leggiOld, endWhile, moreiffalse, positif, fortran;
         int leggiOld = variabile1;
//test: variables and not java keywords
         int endWhile, moreiffalse, positif, fortran;
//test:  for correct parenthesis () management in conditions.
//Condition (if, while, do) rules (see menu:options:parser):
//[<pre>] [(] <condition> [)] [<post>]
// - <pre>, parenthesis, <post> are optionals
         if((variabile1 >= 5) && (variabile1 != 32)) {
//test for '\' embedded in strings:
//  t and u are not variables.
//  Output on pop-up: uses parenthesis.
//  This prints: 'maggiore di"\  u 5\" t '.
            try {
   JOptionPane.showMessageDialog(null,  "maggiore di\"\\  u 5\\\" t  \"");
} catch(Exception e_x){
/* nothing to do */
};
         }
         else {
//Multiple Selection (switch statement):
//<switch_variable>
//(<case_valkue>)+
//%|default
//
//Last line:
// %      = no default
//default = default case
            switch (variabile1) {
               case 4:
//test for special chars(è)
//Set Editor, JStruct to same encoding
                  System.out.println("è 4");
               case 2:
            }
         }
// test: strings and in-code comments
         t = "/* the string1 in t */";
         t += "// the string2 in t "; // a comment for t;
         /* comment #2 */
         t += /* comment#3 */ variabile1;
//test: array initialization
         int[] myList = { 3, 4, 5, 6 };
//variables initialization
         int pippo = myList[3];
//minimal: only for expression, not parenthesis
         for(int k = 10; k > 5; k--) {
//test for += -=
            variabile1 += k;
            pippo -= k;
         }
//"for" alternative style
         for(int i = 0; i <= variabile1; i++) {
            pippo++;
         }
// test: enanched "for" syntax
         for(int d : myList) {
//output on console
            System.out.println(d);
         }
// test while
         while(pippo > 12) {
//test: conditional operator
            pippo = (variabile1 > 12) ? 3 : 10;
         }
//while + condition, but not ()
         do {
            pippo++;
         }
         while(pippo < 3);
// only while condition
         while(pippo < 15) {
// test spaces
            pippo *= (2 + 3);
         }
//calling a not defined Method: JStruct java export creates stub.
         missedMethod();
// test method call
         pippo = mySum(pippo, variabile1);
//test: assignation in condition (allowed in java).
         if((variabile1 = pippo) > 0) {
            pippo %= 12;
         }
//No popup: argument NOT in parethesis
         System.out.println(("Values: pippo= " + pippo) + (" variable1= " + variabile1));
      }

/**
 * Methods must be full defined (exception: main())
 */
      static int mySum(int a, int b) {
         return a + b;
      }

      public static void missedMethod( /*[<type> <param>[, <type> <param>]*] */) {
         // TODO Auto-generated method stub
      }

   }
