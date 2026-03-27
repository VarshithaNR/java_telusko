public class StringMethod {
    public static void main(String[] args) {
        String s = "Varshitha@N@R";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('r',5));
        System.out.println(s.indexOf("arshu"));
        System.out.println(s.substring(6));
        System.out.println(s.substring(0,5));
        System.out.println(s.indexOf("@"));
    }
}
