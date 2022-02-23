import com.revature.model.Question;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.util.MyArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyArrayListTest {

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
    public void ContainsAllQuestions() throws Exception {
        MyArrayList question = new MyArrayList<Question>();
        MyArrayList a1 = new MyArrayList();
        question.add(a1);
        assertTrue(question.equals(a1));
        System.out.println(a1);
    }
}
