public class TrainConsistApp {
    public static void main(String[] args) {
        int[] capacities = {45, 30, 60, 25, 50, 40};
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Passenger Bogie Capacities:");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }
    }
}
