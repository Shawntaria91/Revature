import com.revature.dao.QuestionDAO;
import com.revature.model.Question;
import com.revature.util.MyArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestionDAOTest {
    static QuestionDAO dao;
    @BeforeAll
    public static void initialSetup(){
       dao = new QuestionDAO();
    }
    @BeforeEach
    public void setup(){

    }
    @AfterEach
    public void tearDown(){

    }

    // public boolean contains(CharSequence s) {
    //     return indexOf(s.toString()) > -1;
    // }

    @Test
    public void GetAllQuestions() throws Exception {
        MyArrayList<Question>questions= dao.getAllQuestions();
        assertTrue(questions.getSize()>0);
    }

}
