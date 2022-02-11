package zoo;

//an interface is a guarantee of behavior that can be shared between classes
//for instance: comparable guarantees that 2 objects of the same class can be
//compared to each other (eg sorted alphabetically)
//why do this?

import cookies.Cookie;

//interfaces are a "contract" of behavior
//IE, everything that implements comparable has a contract to be a comparable object
public class Animal implements Comparable<Animal> {

    String species;
    int temp = 0;

    public Animal(String s) throws FakeAnimalException {
        if (s.equals("Bigfoot")) {
            throw new FakeAnimalException("Not a real animal", new Exception());
        }
        species = s;
    }

    //I want to compare 2 animals so we can have them sorted. How is this done?

    // this is an annotation
    //@Override

    public int compareTo(Animal a) {
        return a.species.compareTo(this.species);
    }

    public String toString() {
        return species;
    }
}
