import java.util.*;

class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    int id;
    int capacity;

    Bogie(int id, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0");
        }
        this.id = id;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie(1, 50));
            bogies.add(new Bogie(2, -10));
            bogies.add(new Bogie(3, 70));
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        bogies.forEach(System.out::println);
    }
}