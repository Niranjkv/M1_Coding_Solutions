public class StringManipulator {
    public static String reverseString(String str){
        String stringReverse="";
        for(int i=str.length()-1;i>=0;i--){
            stringReverse+=str.charAt(i);
        }
        return "\""+stringReverse+"\"";
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reverseString("Java"));
        System.out.println(reverseString(""));
        System.out.println(reverseString("a"));
    }
}
