import java.util.Arrays;

public class TrainConsistApp {
    public static void main(String[] args) {
        String[] bogieTypes = {"Sleeper", "General", "AC Chair Car", "First Class", "Second Class"};
        Arrays.sort(bogieTypes);
        System.out.println("Sorted Bogie Types: " + Arrays.toString(bogieTypes));
    }
}
