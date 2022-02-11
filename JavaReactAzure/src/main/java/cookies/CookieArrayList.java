package cookies;

public class CookieArrayList {

    Cookie[] cookieList = new Cookie[16];
    public Cookie get(int i) {
        return cookieList[i];
//    private String[] cookieJar;
//    private int currSize;
//
//    public CookieArrayList() {
//        cookieJar = new String[]{"chocolate chip", "oatmeal", "snickerdoodle"};
//        //currSize = cookieJar.length;
//    }
//
//    public static void main(String[] args) {
//        //variables needed:
//        // Array of something
//        // The current amount of something
//        String cookieJar[] = {};
//
//        System.out.println(cookieJar[0]);
//        System.out.println(cookieJar.length);
        //String newCookieJar[] = new String[currSize++];

    // Constructor that creates an initial array of some size

    // Get method that returns the something of a given index

    // Add method

    // First, check that the arraylist will not break if we try to add at the next index:
    // IE, check if the current amount of somethings+1 is not greater than the array size
    // if it is greater:
        // Copy the elements of the current array to a new array.
        // set the pointer of the arrayList's internal array to the new array.
    // that adds things at an index that is currently unused
    // (this will be the current size)

    // pseudocode

    //Assignment 2/9/2022:
    //    a method that can return a boolean determining if your array list contains a certain item
    //    (if you had an arraylist of objects, as opposed to primitives, you may need to implement and use .equals)
    //    a method that can determine if your arraylist is identical to another one
    //    (again, .equals)
    //    a method that sets a given index to a particular value

        //Read about exceptions handling and try catch
        //Read Day 1-3
    }
}
