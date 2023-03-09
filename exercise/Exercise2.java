/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class Exercise2 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // Use int name.charAt()
    System.out.println(str.charAt(15));
    System.out.println(str.charAt(1));

    // Use int indexOf(int ch), or int indexOf(String ch)
    System.out.println(str.indexOf("t"));
    System.out.println(str.indexOf("x"));
    System.out.println(str.indexOf("LAB"));

    // Use String trim()
    String abc = "    ab c    ";
    System.out.println(abc.trim());

    // Use String replace() method
    System.out.println(str.replace("Java", "Coding"));

    // int length()
    System.out.println(str.length());

    // Use String substring(int start, int end)
    System.out.println(str.substring(5, 8));

    // String toLowerCase(), and String toUpperCase()
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    // Method Chaining, replaceAll(), toUpperCase(), concat()
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    System.out.println(str.replace("e", "*").toUpperCase().concat("!!!"));
  }

}