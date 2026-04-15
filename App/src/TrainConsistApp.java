import java.util.*;
import java.util.stream.*;

class Bogie {
    int id;
    int capacity;

    Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
            new Bogie(1, 50),
            new Bogie(2, 75),
            new Bogie(3, 60),
            new Bogie(4, 80),
            new Bogie(5, 45)
        );

        List<Bogie> filteredBogies = bogies.stream()
                                           .filter(b -> b.capacity > 60)
                                           .toList();

        filteredBogies.forEach(System.out::println);
    }
}