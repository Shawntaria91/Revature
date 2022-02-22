package com.revature.util;


public class MyArrayList<T> {

    ConnectionUtil conn = new ConnectionUtil();

    private T[] myArr = (T[]) new Object[0];
    private int size = 0;

    // Add method
    public void add(T obj) {
        if (myArr.length > 0 && myArr.length != size) {
            myArr[size] = obj;
            size++;

            // IE, check if the current amount of somethings+1 is not greater than (or equal to) the array size
            // if it is greater:
            // Copy the elements of the current array to a new array.
            // set the pointer of the arrayList's internal array to the new array.
        } else if (size == myArr.length) {
            T[] newArray = (T[]) new Object[myArr.length+1 * 2];
            for (int i = 0; i < myArr.length; i++) {
                newArray[i] = myArr[i];
            }
            myArr = newArray;
            myArr[size] = obj;
            size++;
        }
    }

    //reassign present cookie to next index and get rid of empty index
    public void remove(int idx) {
        if (idx >= 0 && idx < size) {

            for (int i = idx; i < size - 1; i++) {
                myArr[i] = myArr[i + 1];
            }
            size--;
        }
    }

    //Efforts to remove obj at given index
    public void remove(T obj) {
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (obj.equals(myArr[i])) {
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
    public T get(int idx) throws Exception {
        if (idx >= 0 && idx < size) {

            return myArr[idx];
        } else {
            throw new Exception("Invalid id");
        }
    }

}
