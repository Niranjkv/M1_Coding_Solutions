import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
public class ListUtils {
    public static List<String> removeDuplicates(List<String> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates(Arrays.asList("apple", "banana", "apple", "orange")));
        System.out.println(removeDuplicates(Arrays.asList("a", "b", "c")));
        System.out.println(removeDuplicates(Arrays.asList("red", "blue", "red", "green", "blue")));
        System.out.println(removeDuplicates(Arrays.asList()));
    }
}
