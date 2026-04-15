import java.util.*;
import java.util.stream.*;

class Bogie {
    int id;
    int capacity;

    Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie(i, (i % 100) + 1));
        }

        long startLoop = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);
    }
}