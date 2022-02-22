package com.revature.service;

import com.revature.dao.QuestionDAO;
import com.revature.model.Question;

import java.sql.SQLException;

import static java.sql.Types.NULL;

public class QuestionService {
    QuestionDAO questiondao;

    public QuestionService() {
        questiondao = new QuestionDAO();
    }

    public QuestionService(QuestionDAO dao) {
        questiondao = dao;
    }

    public boolean addQuestion(int id, String question, int answer, int correctAnswer) {
        if(id < 1) {
            return false;
        }

        try {
            Question q = new Question(id, question, answer, correctAnswer);
            questiondao.addQuestion(q);
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean getAnswer(int userInput) {
        if (userInput != NULL) {
            return true;
        }
        return this.getAnswer(userInput);
    }
}
