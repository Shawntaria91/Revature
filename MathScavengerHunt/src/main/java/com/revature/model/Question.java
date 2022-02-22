package com.revature.model;

import java.util.Scanner;

public class Question<T> {
    private int question_id;
    private String question;
    String prompt;
    private int answer;
    private int correct_answer;

    public Question(int question_id, String question, int answer, int correct_answer) {
        this.question_id = question_id;
        this.question = question;
        this.answer = answer;
        this.correct_answer = correct_answer;
    }

    public static void takeQuiz(Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            int answer = Integer.parseInt(keyboardInput.nextLine());

            if (answer == (questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
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
        return "Question{" +
                "question_id=" + question_id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", correct_answer=" + correct_answer +
                '}';
    }
}
