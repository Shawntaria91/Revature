package cookies;

public class CookieList {

    CookieChain head;

    public CookieList() {

    }

    public void addCookie(Cookie c) {
        // add that cookie to existing list
        // the new cookie chain should point to the previous head

        CookieChain newChainLink = new CookieChain(c, head);
        head = newChainLink;
    }

    public void traverseCookies() {
        CookieChain currentCookie = head;
        while(currentCookie != null) {
            System.out.println(currentCookie.thisCookie);
            currentCookie = currentCookie.nextCookieLink;
        }
    }
}
