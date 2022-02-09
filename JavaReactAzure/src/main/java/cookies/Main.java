package cookies;

public class Main {

    public static void main(String[] args) {
        String[] firstBatch = {
                "chocolate chip",
                "oatmeal",
                "snicker doodle",
                "sugar"
        };

        String[] secondBatch = new String[firstBatch.length + 1];
        for (int i = 0; i < firstBatch.length; i++) {
            secondBatch[i] = firstBatch[i];
        }

        secondBatch[secondBatch.length - 1] = "salted caramel";
        firstBatch = secondBatch;
        firstBatch[1] = null;

        String[] updatedList = new String[firstBatch.length - 1];
        for (int i = 0, j = 0; i < firstBatch.length; i++) {
            if (firstBatch[i] != null) {
                updatedList[j] = firstBatch[i];
                j++;
            }
        }
        firstBatch = updatedList;

        for (String name : firstBatch) {
            System.out.println(name);
        }
    }
}
