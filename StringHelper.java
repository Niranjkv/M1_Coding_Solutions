public class StringHelper {
    public static int getStringLength(String str){
        return str.length();
    }
    public static void main(String[] args) {
        System.out.println(getStringLength("hello"));//output: 5
        System.out.println(getStringLength(""));//Output: 0
        System.out.println(getStringLength("Java is fun"));//Output: 11
    }
}
