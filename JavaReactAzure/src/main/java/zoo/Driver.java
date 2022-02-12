package zoo;


import cookies.Cookie;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Driver {

    public static final Logger log = Logger.getLogger(Driver.class);

    public static void main(String[] args) {

        log.info("Hello logger!");

        System.out.println("cat".compareTo("dog"));
        System.out.println("dog".compareTo("cat"));

        Animal a1 = null;
        Animal a2 = null;
        Animal a3 = null;
        Animal a4 = null;
        Animal a5 = null;
        Animal a6 = null;

        try {
            a1 = new Animal("giraffe");
            a2 = new Animal("cow");
            a3 = new Animal("shark");
            a4 = new Animal("lion");
            a5 = new Animal("lion");
            a6 = new Animal("zebra");
        } catch(FakeAnimalException e) {
            Driver.log.warn("Not real");
        }

        System.out.println(a1.compareTo(a2));

        System.out.println(a2.compareTo(a3));



        AnimalTree<Animal> tree = new AnimalTree<Animal>();
        AnimalTree<Cookie> tree2 = new AnimalTree<Cookie>();


        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Cookie> list2 = new ArrayList<>();

        tree.add(a1);
        tree.add(a2);
        tree.add(a3);
        tree.add(a4);
        tree.add(a5);

        System.out.println("does the tree contain lion?");
        System.out.println(tree.contains(a5));
        System.out.println("does the tree contain zebra?");
        System.out.println(tree.contains(a6));

        try {
            Animal a7 = new Animal("Bigfoot");
            tree.add(a7);
            if(tree.contains(a7)) {
                Driver.log.info("Bigfoot's in the zoo!");
            }
            } catch(FakeAnimalException e) {
            Driver.log.warn("Not real");
        }
    }
}
