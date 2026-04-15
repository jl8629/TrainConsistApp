import java.util.*;
import java.util.stream.*;

class Bogie {
    int id;
    int capacity;
    String type;

    Bogie(int id, int capacity, String type) {
        this.id = id;
        this.capacity = capacity;
        this.type = type;
    }

    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity + ", Type: " + type;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
            new Bogie(1, 50, "Sleeper"),
            new Bogie(2, 75, "AC"),
            new Bogie(3, 60, "General"),
            new Bogie(4, 80, "AC"),
            new Bogie(5, 45, "Sleeper")
        );

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        groupedBogies.forEach((key, value) -> {
            System.out.println("Type: " + key);
            value.forEach(System.out::println);
            System.out.println();
        });
    }
}