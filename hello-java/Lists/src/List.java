import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        var nums = new ArrayList<Integer>();

        System.out.println(names.size());

        names.add("Jhon");
        System.out.println(names.size());
        names.add("Wolf");
        System.out.println(names.size());
        names.add("Leo");
        System.out.println(names.size());

        System.out.println("Index 0: "+names.getFirst());
        System.out.println("Index 2: "+names.getLast());
        System.out.println("Index 1: "+names.get(1));

        names.set(2, "LeWolf");
        System.out.println("Index 2 mod: "+names.get(2));

        names.remove(2);
        // System.out.println("Index 2 deleted: "+names.get(2)); ERROR

        System.out.println("Contiene 'Jhon': "+names.contains("Jhon"));

        System.out.println(names);
    }
}