package com.revature.model;

import com.revature.util.ConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class Question<T> {
    private int question_id;
    private String question;
    private int numQuestions;
    String prompt;
    private int answer;
    private int correct_answer;

    public Question(int question_id, String question, int answer, int correct_answer) {
        this.question_id = question_id;
        this.question = question;
        this.answer = answer;
        this.correct_answer = correct_answer;
    }

    public void populateQuestions() throws SQLException {
        numQuestions=0;
        String SQL="SELECT question_id, question FROM Quiz";
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getAnswer() {
        return answer;
    }

    public int getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(int correct_answer) {
        this.correct_answer = correct_answer;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "question_id=" + question_id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", correct_answer=" + correct_answer +
                '}';
    }
}
