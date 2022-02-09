package zoo;

//an interface is a guarantee of behavior that can be shared between classes
//for instance: comparable guarantees that 2 objects of the same class can be
//compared to each other (eg sorted alphabetically)
//why do this?



//interfaces are a "contract" of behavior
//IE, everything that implements comparable has a contract to be a comparable object
public class Animal implements Comparable {

    String species;
    int temp = 0;

    public Animal(String s) {

        species = s;
    }

    //I want to compare 2 animals so we can have them sorted. How is this done?

    // this is an annotation
    //@Override

    public int compareTo(Animal a) {
        return a.species.compareTo(this.species);
    }
}
