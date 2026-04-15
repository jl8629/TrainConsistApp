import java.util.*;

class Bogie {
    int id;
    int capacity;
    String type;

    Bogie(int id, int capacity, String type) {
        this.id = id;
        this.capacity = capacity;
        this.type = type;
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

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}