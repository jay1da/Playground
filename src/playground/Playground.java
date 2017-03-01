package playground;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

/**
 * This is an auto generated class meant to be replaced and/or removed. However; it is recommended that you use the same
 * template.
 *
 * @author Jason Liu
 */
public class Playground {

    /**
     * This is an auto generated method meant to be removed.
     *
     * @param args the arges
     */
    public static void main(String[] args) throws Exception {

        String text = "\"    <<23>> hello   <<1>>    <<hello>>  \"";

        text = formatText(text);

        String test = "123432642512344";

        String[] splitTest = test.split("s");
        test = splitTest[0];

        System.out.println(test);

        String apostrophie = "&apos;";

        System.out.println(apostrophie);
        System.out.println(StringEscapeUtils.unescapeXml(apostrophie));

        Collection<String> splittest = Arrays.asList("none".split("\\s*,\\s*"));

        for (String a : splittest) {
            System.out.println(a);
        }

        boolean inDaylightTime = TimeZone.getTimeZone("Canada/Saskatchewan").inDaylightTime(new Date());

        if (inDaylightTime) {
            System.out.println("in daylight time");
        }

    }

    private static String formatText(String text) {

        System.out.println("before format: |" + text + "|");

        text = StringUtils.removeStart(text, "\"");
        text = StringUtils.removeEnd(text, "\"");
        text = text.replaceAll("<<.*?>>", "");
        text = text.trim();

        System.out.println("after format: |" + text + "|");

        return text;
    }
}
