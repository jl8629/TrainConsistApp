public class TrainConsistApp {
    public static void main(String[] args) {
        String[] bogieIDs = {"B101", "B150", "B205", "B320", "B410"};
        String searchKey = "B205";
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = searchKey.compareTo(bogieIDs[mid]);
            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}
