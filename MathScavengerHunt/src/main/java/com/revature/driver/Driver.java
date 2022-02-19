package com.revature.driver;

import com.revature.service.MathProblemService;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public final class Driver {
    public static Connection conn = ConnectionUtil.getConnection();
    public static void main(String[] args) throws SQLException {

        MathProblemService mathProblemService = new MathProblemService();

        conn.setAutoCommit(true);

        System.out.println(mathProblemService.getUserAnswer("Solve for x: 2x + 32 = 0"));
        mathProblemService.addMathProblem(1, "Solve for x: 2x + 32 = 0", -16);
    }
}
