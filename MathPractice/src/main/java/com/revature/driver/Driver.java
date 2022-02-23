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
        MyArrayList<Question> allQuestions = questionService.getAllQuestions();
        conn.setAutoCommit(true);

        //main game loop

        int i;
        int score = 0;
        for (i = 0; i < allQuestions.getSize(); i++) {
            Question currentQuestion = allQuestions.get(i);
            boolean answerIsCorrect = false;
            int tries = 1;

            while (!answerIsCorrect && tries <= 3) {
                System.out.println(currentQuestion.getQuestion());
                Scanner sc = new Scanner(System.in);
                int userAnswer = sc.nextInt();

                answerIsCorrect = userAnswer == currentQuestion.getCorrect_answer();
                if (answerIsCorrect) {
                    System.out.println("Correct Answer");
                    score++;
                } else {
                    if (tries >= 3 && i < allQuestions.getSize() - 1) {
                        System.out.println("Keep practicing! Let's try another one!");
                        break;
                    } else if (tries >= 3 && i >= allQuestions.getSize() - 1) {
                        break;
                    }else {
                        System.out.println("Try again");
                        tries++;
                    }
                }
            }
        }
        System.out.println("You have completed the quiz! Your score is " + score + " out of " + i);
    }
}
