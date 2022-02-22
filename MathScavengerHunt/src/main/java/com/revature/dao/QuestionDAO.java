package com.revature.dao;

import com.revature.model.Question;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static com.revature.driver.Driver.conn;


public class QuestionDAO {
    public QuestionDAO(){
        this(1);
    }
    public QuestionDAO(int i){
        System.out.println("making constructor "+i);
    }

    public List<Question> getAllQuestions() {
        return null;
    }

    public Question getQuestion(String question) throws SQLException {
        Question myQuestion = null;
        PreparedStatement statement = conn.prepareStatement("Select * From MathProblem Where question = ?");
        int parameterIndex = 0;
        statement.setString(++parameterIndex, question);
        /* ++var vs var++?
        the iteration happens before vs after the line executes
         */
        ResultSet rs = statement.executeQuery();
        /*
        if(rs.next()) {
            rs.beforeFirst();
        }else*/
        while(rs.next()){
            myQuestion = new Question(rs.getInt("question_id"),
                    rs.getString("question"),
                    rs.getInt("answer"),
                    rs.getInt("correct_answer"));
        }
        rs.close();
        return myQuestion;
    }

    public void addQuestion(Question Q) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(
                "Insert into Quiz (question_id, question, answer, correct_answer)" +
                        "Values" +
                        "(?,?,?,?)");
        int parameterIndex = 0;
        statement.setInt(++parameterIndex, Q.getQuestion_id());
        statement.setString(++parameterIndex, Q.getQuestion());
        statement.setInt(++parameterIndex, Q.getAnswer());
        statement.setInt(++parameterIndex, Q.getCorrect_answer());
        statement.executeUpdate();
    }

    //public MathProblem getUserAnswer(int userInput) {
//
    //}
}
