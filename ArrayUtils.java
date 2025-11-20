public class ArrayUtils {
    public static int findLargest(int[] numbers){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(findLargest(new int[]{1,5,2,9,3}));//Output: 9
        System.out.println(findLargest(new int[]{-10,-5,-2}));//output: 2
        System.out.println(findLargest(new int[]{7}));
    }
}
