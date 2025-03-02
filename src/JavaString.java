import java.util.Arrays;
import java.util.Locale;

public class JavaString {

    static void run() {
        String myName = "India";


        var a = myName.length();
        System.out.println(a);

        var b = myName.getBytes();
        System.out.println(Arrays.toString(b));

        var c = myName.toLowerCase(Locale.UK);
        System.out.println(c);

        // most important to me, it replaces the %s with the string provided in the argument
        var d = "India %s".formatted("is my country");
        System.out.println(d);

        var e = myName.replace("India", "Bharat");
        System.out.println(e);

        // return 0 if both strings are equal
        var f = myName.compareToIgnoreCase("india");
        System.out.println(f);

        // compareTo() method returns the difference of first unmatched characters in two strings
        var g = myName.compareTo("india");
        System.out.println(g);


        // break the string into lines and convert to list.
        var aPara = "India is my country\nI love my country.";
        var h = aPara.lines().toList();
        System.out.println(h);


    }
}