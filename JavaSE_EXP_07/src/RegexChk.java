public class RegexChk {
    private  String regex;
    public boolean is_integer(String str){
        regex = "-?[1-9]\\d*";
        return str.matches(regex);
    }
    public boolean is_phoneNumber(String str){
        regex = "1\\d{10}";
        return str.matches(regex);
    }
    public boolean is_emailAddress(String str){
        regex="\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?";
        return str.matches(regex);
    }
    public boolean is_zipCode(String str){
        regex="\\d{6}";
        return str.matches(regex);
    }
    public boolean is_id(String str){
        regex="[1-9][0-9]{16}[a-zA-Z0-9]{1}";
        return str.matches(regex);
    }
}
