import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {

        ///This is the first way
        // 1 - Create a Pattern object that will define the pattern against which the string will be compared
        // 2- Create a Matcher object that will contain a string to compare with the pattern
        // 3- Create a boolean that will compare the pattern with the matcher
        Pattern p = Pattern.compile(".m");
        Matcher m = p.matcher(".m");
        boolean b = m.matches();
        System.out.println("The first way result is " +b);

        ///This is the second way
        boolean b2 = Pattern.compile(".m").matcher("monica").matches();
        System.out.println("The second way result is " +b2);

        /// This is the third way
        boolean b3 = Pattern.matches(".m", "am");
        System.out.println("The third way result is " +b3);

        /// More examples using the 3rd way
        System.out.println(Pattern.matches("[amn]", "acd"));
        System.out.println(Pattern.matches("[amn]", "a"));
        System.out.println(Pattern.matches("[amn]", "c"));
        System.out.println(Pattern.matches("[a-zA-S]", "T"));
        System.out.println(Pattern.matches("[a-ds-u]","b" ));

    }
}
