package com.revature.dao;

import com.revature.model.MathProblem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static com.revature.driver.Driver.conn;

public class MathProblemDAO {
    public MathProblemDAO(){
        this(1);
    }
    public MathProblemDAO(int i){
        System.out.println("making constructor "+i);
    }

    public List<MathProblem> getAllMathProblems() {
        return null;
    }

    public MathProblem getMathProblem(String problem) throws SQLException {
        MathProblem myMathProblem = null;
        PreparedStatement statement = conn.prepareStatement("Select * From MathProblem Where problem = ?");
        int parameterIndex = 0;
        statement.setString(++parameterIndex, problem);
        /* ++var vs var++?
        the iteration happens before vs after the line executes
         */
        ResultSet rs = statement.executeQuery();
        /*
        if(rs.next()) {
            rs.beforeFirst();
        }else*/
        while(rs.next()){
            myMathProblem = new MathProblem(rs.getInt("scavengerItem_id"),
                    rs.getString("problem"),
                    rs.getInt("correct_answer"));
        }
        rs.close();
        return myMathProblem;
    }

    public void addMathProblem(MathProblem M) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(
                "Insert into MathProblem (scavengerItem_id, problem, correct_answer)" +
                        "Values" +
                        "(?,?,?,?,?)");
        int parameterIndex = 0;
        statement.setInt(++parameterIndex, M.getScavengerItem_id());
        statement.setString(++parameterIndex, M.getProblem());
        statement.setInt(++parameterIndex, M.getCorrect_answer());
        statement.executeUpdate();
    }

    public MathProblem getUserAnswer(int userInput) {

    }
}
