package cookies;

public class Driver {



    public static void main(String[] args) {

        boolean myBoolean = false;
        boolean myBoolean2 = false;
        byte myByte = 123;
        short s = 1234;
        char myChar = 'a';
        int myInt = 12345;
        float myFloat = 1.0000001F;
        long myLong = 1234567890L;
        double myDouble = 222.22222222;

        String myString = "Hello";
        Integer[] arrayOfIntegers = new Integer[16];

        int changeThisToInt = Integer.parseInt("5");

        if(myBoolean) {
            //do this
        } else if(myBoolean2) {

        } else {

        }

        while(myBoolean && myBoolean2) {
            int myScopedInt = 0;
            myScopedInt = 5;
        }

        for(int i = 0; i < 16; i++) {
            arrayOfIntegers[i] = 2;
        }

        do {
            // do this
        } while(myBoolean2);
        //switch statements

        myBoolean = returnTruePlease();

        Math.sqrt(4);

        Cookie c1 = new Cookie();
        Cookie c2 = c1;

        c1.edible = true;
        c1.setType("chocolate chip");

        Cookie c3 = new HyperCookie();
        Cookie c4 = new Cookie("oatmeal", 100);

        Cookie[] cookiesArray = new Cookie[4];

        cookiesArray[0]=c1;
        cookiesArray[1]=c2;
        cookiesArray[2]=c3;
        cookiesArray[3]=c4;
        myInt = cookiesArray.length;

        CookieList myList = new CookieList();
        myList.addCookie(c1);
        myList.addCookie(c2);
        myList.addCookie(c3);
        myList.addCookie(c4);

        myList.traverseCookies();

    }

    public static boolean returnTruePlease() {
        return true;
    }

}


