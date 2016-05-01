import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Danilo Bustos on 4/30/16.
 */
public class tweetsTokenizer {
    String emoticon_string = "(?:[<>]?[:;=8][\\-o\\*\\']?[\\)\\]\\(\\[dDpP/\\:\\}\\{@\\|\\\\]|[\\)\\]\\(\\[dDpP/\\:\\}\\{@\\|\\\\][\\-o\\*\\']?[:;=8][<>]?)";

    Pattern html_entity_digit = Pattern.compile("&#\\d+;");

    String html_entity_alpha = "&\\w+";

    public List<String> tokenize(String _tweet) {
        String tweet = _tweet;

        Matcher m = html_entity_digit.matcher(tweet);

        while (m.find()) {
            m.group(0);
        }



    }

    private String html2unicode(String tweet) {

    }




}
