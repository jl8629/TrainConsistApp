public class TrainConsistApp {
    public static void main(String[] args) {
        String[] bogieIDs = {"B101", "B205", "B150", "B320", "B410"};
        String searchKey = "B150";
        boolean found = false;
        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}
