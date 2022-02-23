package com.revature.driver;

import com.revature.model.Question;
import com.revature.service.QuestionService;
import com.revature.util.ConnectionUtil;
import com.revature.util.MyArrayList;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public final class Driver {
    public static Connection conn = new ConnectionUtil().getConnection();

    public static void main(String[] args) throws Exception {


        QuestionService questionService = new QuestionService();
        MyArrayList<Question>allQuestions = questionService.getAllQuestions();
        conn.setAutoCommit(true);

        //main game loop
        for (int index = 0; index < allQuestions.getSize(); index++){
            Question currentQuestion = allQuestions.get(index);
            boolean answerIsCorrect = false;
            while (!answerIsCorrect)
            {
                System.out.println(currentQuestion.getQuestion());
                Scanner sc = new Scanner(System.in);
                int userAnswer= sc.nextInt();
                answerIsCorrect = userAnswer == currentQuestion.getCorrect_answer();
                if (answerIsCorrect){
                    System.out.println("Correct Answer");
                }else
                {
                    System.out.println("Try again");
                }
            }

        }

    }
}
