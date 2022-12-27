import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Set1 {
    public static void main(String[] args){
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("b");
        set1.add("b");
        set1.add("a");
        System.out.println("set1 : " + set1);
    }
}
