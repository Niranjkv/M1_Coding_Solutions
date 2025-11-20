public class FibonacciCalculator {
    public static int fibonacci(int n){
        if(n<=1) return n;
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(10));

    }
}
