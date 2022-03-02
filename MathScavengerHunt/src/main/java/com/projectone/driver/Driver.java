package com.projectone.driver;

import com.projectone.model.MathQuestion;
import com.projectone.model.ScavengerItem;
import com.projectone.service.MathQuestionService;
import com.projectone.service.ScavengerItemService;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        ScavengerItemService ss = new ScavengerItemService();
        MathQuestionService ms = new MathQuestionService();

        ScavengerItem s1 = new ScavengerItem();
        s1.setId(1);
        s1.setName("pencil");
        ScavengerItem s2 = new ScavengerItem();
        s2.setId(2);
        s2.setName("calculator");
        ss.addScavengerItem(s1);
        ss.addScavengerItem(s2);

        List<ScavengerItem> scavengerItems= ss.getAllScavengerItems();
        for(ScavengerItem s : scavengerItems){
            System.out.println(s);
        }
        //Transient state
        //we have a java object, but that java object has not been persisted to the database yet
        MathQuestion m1 = new MathQuestion();
        m1.setMathQuestion_id(1);
        m1.setQuestion("2x + 32 = 0");
        m1.setScavengerItem(s1);
        //Persistent object
        //we have a java object that is currently being persisted into the database
        ms.addMathQuestion(m1);

        m1.setCorrectAnswer(-16);
        m1.setLevel(1);
        ms.updateMathQuestion(m1);
        List<MathQuestion> myMathQuestions = ms.getAllMathQuestions();
        for(MathQuestion m : myMathQuestions){
            System.out.println(m);
        }

    }
}
