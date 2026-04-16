public class TrainConsistApp {
    public static void main(String[] args) {
        String[] bogieIDs = {};
        String searchKey = "B205";
        if (bogieIDs.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }
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
