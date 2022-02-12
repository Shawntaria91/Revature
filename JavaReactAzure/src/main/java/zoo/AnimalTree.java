package zoo;

public class AnimalTree<T extends Comparable<T>> {

    AnimalBranch<T> head;

    //constructor
    public AnimalTree() {

    }

    //process:
    //check if head exists
    //if exists, check if left child exists
    //if left child exists, examine left child
    //new branch is greater than curr branch, so check if right child exists
    //right child does not exist, so we set current.right to a new animalBranch

    //our toolbox:
    //will need to keep track of curr branch
    //will need to continue while an empty slot has not been found
    //will need to check if head is null first

    //return true if adding was successful
    public boolean add(T a) {
        if (head == null) {
            Driver.log.info("Added as head: "+ a);
            head = new AnimalBranch(a);
        } else {
            AnimalBranch current = head;
            while(true) {
                if (current.getAnimal().compareTo(a) < 0) {
                    Driver.log.info("Current animal: " + current.getAnimal() + ", Branching left");

                    if (current.left == null) {
                        current.left = new AnimalBranch(a);
                        System.out.println("Added animal: " + a);
                        return true;
                    } else {
                        current = current.left;
                    }
                } else if (current.getAnimal().compareTo(a) > 0) {
                    Driver.log.info("Current animal: " + current.getAnimal() + ", Branching right");
                    if (current.right == null) {
                        current.right = new AnimalBranch(a);
                        System.out.println("Added animal: " + a);
                        return true;
                    } else {
                        current = current.right;
                    }
                } else {
                    Driver.log.info("Species " + a + "already exists!");
                    return false;
                }
            }

        }
        return false;

    }

    public boolean contains(T a) {

        if (head == null) {
            System.out.println("Added as head: " + a);
            return false;
        } else {
            AnimalBranch current = head;
            while(true) {
                if (current.getAnimal().compareTo(a) < 0) {
                    Driver.log.info("Current animal: " + current + ", Branching left");

                    if (current.left == null) {
                        Driver.log.info("Animal does not exist: " + a);
                        return false;
                    } else {
                        current = current.left;
                    }

                } else if (current.getAnimal().compareTo(a) > 0) {
                    Driver.log.info("Current animal: " + current + "Branching right");
                    if (current.right == null) {
                        current.right = new AnimalBranch(a);
                        Driver.log.info("Animal does not exist: " + a);
                        return false;
                    } else {
                        current = current.right;
                    }
                } else {
                    Driver.log.info("Species " + a + "already exists!");
                    return true;
                }
            }
        }

    }
}
