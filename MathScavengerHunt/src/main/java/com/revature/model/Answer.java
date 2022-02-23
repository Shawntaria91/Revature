package com.revature.model;

public class Answer {
    private int answer;
    private boolean correct;

    public Integer Answer(int answer, boolean correct) {
        this.answer = answer;
        this.correct = correct;
        return null;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    //@Override
    //public String toString(char display) {
    //    return display+ ": " + userResponse;
    //}
}
