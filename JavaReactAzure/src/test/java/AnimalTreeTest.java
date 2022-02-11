import org.junit.Assert;
import org.junit.Test;

import zoo.Animal;
import zoo.AnimalTree;

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

    @Test
    void ContainsAddedAnimal() {
        AnimalTree<Animal> tree1 = new AnimalTree<Animal>();
        Animal a1 = new Animal(Giraffe);
        tree1.add(a1);
        Assert.assertTrue(tree1.contains(a1));
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
