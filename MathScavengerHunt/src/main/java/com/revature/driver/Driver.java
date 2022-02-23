package com.revature.driver;

import com.revature.model.Question;
import com.revature.service.QuestionService;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public final class Driver {
    public static Connection conn = new ConnectionUtil().getConnection();

    public static void main(String[] args) throws SQLException {


        QuestionService questionService = new QuestionService();

        conn.setAutoCommit(true);

        System.out.println(questionService.getAnswer(-16));
        questionService.addQuestion(1, "Solve for x: 2x + 32 = 0", -16, -16);
    }
}
