package com.revature.model;

public class MathProblem {
    private int scavengerItem_id;
    private String problem;
    private int correct_answer;

    public MathProblem(int scavengerItem_id, String problem, int correct_answer) {
        this.scavengerItem_id = scavengerItem_id;
        this.problem = problem;
        this.correct_answer = correct_answer;
    }

    public int getScavengerItem_id() {
        return scavengerItem_id;
    }

    public void setScavengerItem_id(int scavengerItem_id) {
        this.scavengerItem_id = scavengerItem_id;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public int getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(int correct_answer) {
        this.correct_answer = correct_answer;
    }

    @Override
    public String toString() {
        return "MathProblem{" +
                "scavengerItem_id=" + scavengerItem_id +
                ", problem='" + problem + '\'' +
                ", correct_answer=" + correct_answer +
                '}';
    }
}
