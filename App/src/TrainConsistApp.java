import java.util.*;

class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

class Bogie {
    int id;
    String shape;
    String cargo;

    Bogie(int id, String shape) {
        this.id = id;
        this.shape = shape;
    }

    void assignCargo(String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned to Bogie " + id);
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed for Bogie " + id);
        }
    }

    public String toString() {
        return "Bogie ID: " + id + ", Shape: " + shape + ", Cargo: " + cargo;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
            new Bogie(1, "Cylindrical"),
            new Bogie(2, "Rectangular")
        );

        bogies.get(0).assignCargo("Petroleum");
        bogies.get(1).assignCargo("Petroleum");

        bogies.forEach(System.out::println);
    }
}