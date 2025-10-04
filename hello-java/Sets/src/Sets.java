import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        var nums = new HashSet<Integer>();

        System.out.println(names.size());

        names.add("Jhon");
        System.out.println(names.size());
        names.add("Wolf");
        System.out.println(names.size());
        names.add("Leo");
        System.out.println(names.size());

        System.out.println(names);
        System.out.println("Contiene: "+names.contains("Jhon"));
        System.out.println();
    }
}