import java.util.*;

class Bogie {
    int id;
    String type;
    String cargo;

    Bogie(int id, String type, String cargo) {
        this.id = id;
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
            new Bogie(1, "Cylindrical", "Petroleum"),
            new Bogie(2, "Box", "Coal"),
            new Bogie(3, "Cylindrical", "Petroleum"),
            new Bogie(4, "Flat", "Steel")
        );

        boolean isSafe = bogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        if (isSafe) {
            System.out.println("Train is safety compliant");
        } else {
            System.out.println("Train is NOT safety compliant");
        }
    }
}