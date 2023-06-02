import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        RegexChk regexChk = new RegexChk();
        String[] check = {"abcd@abcd.com.cn","123124","-43","123445","12949483829"};
        Pattern pattern = Pattern.compile("[1-9]+");
        for(String s:check){
            Matcher matcher = pattern.matcher(s);
            boolean result = matcher.matches();
            System.out.println(result);
            System.out.println(regexChk.is_id(s));
            System.out.println(regexChk.is_integer(s));
            System.out.println(regexChk.is_emailAddress(s));
            System.out.println(regexChk.is_zipCode(s));
            System.out.println((regexChk.is_phoneNumber(s)));
        }
    }
}