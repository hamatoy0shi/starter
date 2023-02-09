import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static Pattern pattern = Pattern.compile("\\d+");
    public static void main(String[] args) {
        if (args.length == 0) System.exit(0);
        Matcher matcher = pattern.matcher(args[0]);
        int result = 0;

        while (matcher.find()) {
           result += Integer.parseInt(matcher.group());
        }

        System.out.println(result);
    }

}