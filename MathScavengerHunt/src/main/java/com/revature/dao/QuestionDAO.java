package com.revature.dao;

import com.revature.model.Question;
import com.revature.util.MyArrayList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.revature.driver.Driver.conn;


public class QuestionDAO {
    public QuestionDAO(){
        this(1);
    }
    public QuestionDAO(int i){
        System.out.println("making constructor "+i);
    }


    public MyArrayList<Question> getAllQuestions() throws SQLException {
        //Result container
        MyArrayList<Question> questions = new MyArrayList<>();
        //Prep sql
        PreparedStatement statement = conn.prepareStatement("Select * From quiz");
        //Execute sql statement
        ResultSet rs = statement.executeQuery();

        Question myQuestion;
        while(rs.next()){
            myQuestion = new Question(rs.getInt("question_id"),
                    rs.getString("question"),
                    rs.getInt("answer"),
                    rs.getInt("correct_answer"));
            questions.add(myQuestion);
        }
        rs.close();
        return questions;
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
}
