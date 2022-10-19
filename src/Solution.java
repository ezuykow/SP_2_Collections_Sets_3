import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Solution {

    static Set<String> tasks = new HashSet<>(15);

    public static void main(String[] args) {

        fillTasks();

        tasks.forEach(System.out::println);
    }

    private static void fillTasks() {
        Random r = new Random();

        int i = 0;
        while (i < 15) {
            int o1 = r.nextInt(7) + 2;
            int o2 = r.nextInt(7) + 2;

            if (!tasks.contains(o1 + " * " + o2) && !tasks.contains(o2 + " * " + o1)) {
                tasks.add(o1 + " * " + o2);
                i++;
            }
        }
    }

}