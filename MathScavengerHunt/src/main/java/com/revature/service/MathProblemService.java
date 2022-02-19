package com.revature.service;

import com.revature.dao.MathProblemDAO;
import com.revature.model.MathProblem;

import java.sql.SQLException;

public class MathProblemService {
    MathProblemDAO mathproblemdao;

    public MathProblemService() {
        mathproblemdao = new MathProblemDAO();
    }

    public MathProblemService(MathProblemDAO dao) {
        mathproblemdao = dao;
    }

    public boolean addMathProblem(int id, String problem, int correctAnswer) {
        if(id < 1) {
            return false;
        }

        try {
            MathProblem m = new MathProblem(id, problem, correctAnswer);
            mathproblemdao.addMathProblem(m);
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public MathProblem getUserAnswer(int userInput, int correctAnswer) {
        if (userInput != correctAnswer) {
            return null;
        }
        try {
            return mathproblemdao.getUserAnswer(userInput);
        } catch(SQLException e) {
            return null;
        }
    }
}
