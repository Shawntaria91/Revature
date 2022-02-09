package cookies;

public class MyArrayList {
    //variables needed:
    // Array of something
    // The current amount of something
    // Constructor that creates an initial array of some size
    private String[] cookieArr = new String[10];
    private int size = 0;

    // Add method
    public void add(String cookie) {
        cookieArr[size] = cookie;
        size++;

        // IE, check if the current amount of somethings+1 is not greater than (or equal to) the array size
        // if it is greater:
            // Copy the elements of the current array to a new array.
            // set the pointer of the arrayList's internal array to the new array.
        if (size == cookieArr.length) {
            String[] newArray = new String[cookieArr.length * 2];
            for (int i = 0; i < cookieArr.length; i++) {
                newArray[i] = cookieArr[i];
            }
            cookieArr = newArray;
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

    public static void main(String[] args) {
        MyArrayList cookies = new MyArrayList();
        cookies.add("chocolate chip");
        cookies.add("sugar");
        cookies.add("snicker doodle");
        cookies.add("salted caramel");
        cookies.add("red velvet");
        cookies.add("oreo");
        //cookies.remove("red velvet");
        //cookies.remove("birthday cake");
        //cookies.remove(2);
        //for (int i = 1; i <= 100; i++) {
        //    cookies.add("cookie type " + i);
        //}

        // (this will be the current size)
        for (int i = 0; i < cookies.getSize(); i++) {
            System.out.println(cookies.get(i));
        }

        System.out.println("There are " + cookies.getSize() + " cookies in the cookie jar.");

    }
}

