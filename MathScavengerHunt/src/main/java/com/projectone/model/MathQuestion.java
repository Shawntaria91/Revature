package com.projectone.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name="mathQuestion")
@JsonIdentityInfo(
        //this is to stop recursive hibernate joins
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class MathQuestion {
    @Id
    @Column(name="mathQuestion_id")
    private int mathQuestion_id;
    @Column
    private String question;
    @ManyToOne
    @JoinColumn(name = "scavengerItem_id")
    @JsonIgnoreProperties(value = {"mathQuestions", "id"})
    public ScavengerItem scavengerItem;
    @Column(nullable = false)
    public int correctAnswer;
    @Column(nullable = false)
    public int level;

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int userInput) {
        this.level = level;
    }

    public int getMathQuestion_id() {
        return mathQuestion_id;
    }

    public void setMathQuestion_id(int mathQuestion_id) {
        this.mathQuestion_id = mathQuestion_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ScavengerItem getScavengerItem() {
        return scavengerItem;
    }

    public void setScavengerItem(ScavengerItem scavengerItem) {
        this.scavengerItem = scavengerItem;
    }

    @Override
    public String toString() {
        return "MathQuestion{" +
                "mathQuestion_id=" + mathQuestion_id +
                ", question='" + question + '\'' +
                '}';
    }
}
