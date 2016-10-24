import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "ivan ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Ivan IvAnov, Ivan Ivanov";
        String regex = "(\\b[A-Z][a-z]+ [A-Z][a-z]+\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String corrName = matcher.group(1);
            System.out.println(corrName);
        }


    }
}
