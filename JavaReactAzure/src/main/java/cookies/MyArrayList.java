package cookies;

public class MyArrayList {
    //variables needed:
    // Array of something
    // The current amount of something
    // Constructor that creates an initial array of some size
    private String[] cookieArr = new String[0];
    private int size = 0;

    // Add method
    public void add(String cookie) {
        if (cookieArr.length > 0 && cookieArr.length != size) {
            cookieArr[size] = cookie;
            size++;

            // IE, check if the current amount of somethings+1 is not greater than (or equal to) the array size
            // if it is greater:
            // Copy the elements of the current array to a new array.
            // set the pointer of the arrayList's internal array to the new array.
        } else if (size == cookieArr.length) {
            String[] newArray = new String[cookieArr.length+1 * 2];
            for (int i = 0; i < cookieArr.length; i++) {
                newArray[i] = cookieArr[i];
            }
            cookieArr = newArray;
            cookieArr[size] = cookie;
            size++;
        }
    }

    //reassign present cookie to next index and get rid of empty index
    public void remove(int idx) {
        if (idx >= 0 && idx < size) {

            for (int i = idx; i < size - 1; i++) {
                cookieArr[i] = cookieArr[i + 1];
            }
            size--;
        }
    }

    //Efforts to remove cookie at given index
    public void remove(String cookie) {
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (cookie.equals(cookieArr[i])) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            remove(idx);
        }
    }

    public int getSize() {
        return size;
    }
    // Get method that returns the something of a given index
    public String get(int idx) {
        if (idx >= 0 && idx < size) {

            return cookieArr[idx];
        } else {
            return "The element is not present.";
        }
    }

    //a method that can return a boolean determining if your array list contains a certain item
    //public boolean equals(SimpleArrayList a) {
    //    if (a.getArrayItems() != arrayItems) {
    //        return false;
    //    } else {
    //        Object[] aObjects = a.getObjectArray();
    //        for (int i = 0; i < arrayItems; i++) {
    //            boolean contains = false;
    //            for (int j = 0; j < arrayItems; j++) {
    //                if (aObjects[i].equals(objectArray[j])) {
    //                    contains = true;
    //                    break;
    //                }
    //            }
    //            if (!contains) {
    //                return false;
    //            }
    //        }
    //    }
    //    return true;
    //}

    //ArrayList1.equals(ArrayList2)

    //public void setCookieArr(String[] cookieArr) {
     //   this.cookieArr = cookieArr;
    //}

}

