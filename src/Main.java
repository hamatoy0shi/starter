import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) System.exit(0);
        System.out.println(findPattern(args[0], 0));
    }

    public static Integer findPattern(String text, Integer currentRes) {
        Integer nextFound = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        boolean found = matcher.find();
        if (found) {
            String matchFound = matcher.group();
            nextFound = currentRes + Integer.parseInt(matchFound);
            currentRes = findPattern(matcher.replaceFirst(""), nextFound);
        }
        return (currentRes);
    }
}