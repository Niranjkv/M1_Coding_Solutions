public class NumberChecker {
    public static String checkEvenOdd(int number){
        return (number%2==0?"Even":"Odd");
    }
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(4));
        System.out.println(checkEvenOdd(7));
        System.out.println(checkEvenOdd(0));
    }
}
