package com.projectone.service;

import com.projectone.model.MathQuestion;
import com.projectone.repository.MathQuestionRepository;

import java.util.List;

public class MathQuestionService {
    MathQuestionRepository mr;
    public MathQuestionService(){
        mr = new MathQuestionRepository();
    }
    public List<MathQuestion> getAllMathQuestions(){
        return mr.getAllMathQuestions();
    }
    public boolean addMathQuestion(MathQuestion m){
        if(mr.getMathQuestion(m) == null) {
            return mr.addMathQuestion(m);
        }
        return false;
    }
    public boolean updateMathQuestion(MathQuestion m){
        return mr.updateMathQuestion(m);
    }
}
