import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zoo.Animal;
import zoo.AnimalTree;
import zoo.FakeAnimalException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTreeTest {

    //junit is a testing framework for Java
    //unit testing tests a small unit of our code
    //like the functionality of a single method of a single class
    /**
     * Annotations?
     * @Test
     * @BeforeAll
     * @AfterAll
     * @BeforEach
     * @AfterEach
     *
     * TDD - Test Driven Development
     * -Tests are written before implementation
     * Progress on implementation can be measured by the completion of additional tests
     */

    @BeforeAll
    public static void initialSetup(){

    }
    @BeforeEach
    public void setup(){

    }
    @AfterEach
    public void tearDown(){

    }

    @Test
    void ContainsOneAddedAnimal() throws FakeAnimalException {
        AnimalTree<Animal> tree1 = new AnimalTree<Animal>();
        Animal a1 = new Animal("Giraffe");
        tree1.add(a1);
        assertTrue(tree1.contains(a1));
    }

    @Test
    public void ContainsTwoAddedAnimal() throws FakeAnimalException {
        AnimalTree<Animal> tree1 = new AnimalTree<Animal>();
        Animal a1 = new Animal("Giraffe");
        Animal a2 = new Animal("Lion");
        tree1.add(a1);
        tree1.add(a2);
        assertTrue(tree1.contains(a2));
    }
    @Test
    public void DoesNotContainAnimal() throws FakeAnimalException {
        AnimalTree<Animal> tree1 = new AnimalTree<Animal>();
        Animal a1 = new Animal("Giraffe");
        Animal a2 = new Animal("Lion");
        Animal a3 = new Animal("Monkey");
        tree1.add(a1);
        tree1.add(a2);
        assertTrue(!(tree1.contains(a3)));
    }
}

/**
 * 2/10/2022 Assignment
 * write some automated testing methods in junit using:
 * @Test
 * some form of assertion
 * (assertTrue, assertEquals)
 *
 * As well as continuing to work on your ArrayList implementations.
 */
