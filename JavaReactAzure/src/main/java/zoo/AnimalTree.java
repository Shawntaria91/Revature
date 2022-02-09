package zoo;

public class AnimalTree {

    AnimalBranch head;

    //constructor
    public AnimalTree() {

    }

    //process:
    //check if head exists
    //if exists, check if left child exists
    //if left child exists, examine left child
    //new branch is greater than curr branch, so check if right child exists
    //right child does not exis, so we set current.right to a new animalBranch

    //our toolbox:
    //will need to keep track of curr branch
    //will need to continue while an empty slot has not been found
    //will need to check if head is null first
    public boolean add(Animal a) {
        if (head == null) {
            System.out.println("Added as head: "+ a.species);
            head = new AnimalBranch(a);
        } else {
            AnimalBranch current = head;
            while(true) {
                if (current.getAnimal().compareTo(a) < 0) {
                    System.out.println("Current animal: " + current.getAnimal().species + ", Branching left");

                    if (current.left == null) {
                        current.left = new AnimalBranch(a);
                        System.out.println("Added animal: " + a.species);
                        return true;
                    } else {
                        current = current.left;
                    }
                } else if (current.getAnimal().compareTo(a) > 0) {
                    System.out.println("Current animal: " + current.getAnimal().species + ", Branching right");
                    if (current.right == null) {
                        current.right = new AnimalBranch(a);
                        System.out.println("Added animal: " + a.species);
                        return true;
                    } else {
                        current = current.right;
                    }
                } else {
                    System.out.println("Species " + a.species + "already exists!");
                    return false;
                }
            }

        }
        return false;

    }
}
