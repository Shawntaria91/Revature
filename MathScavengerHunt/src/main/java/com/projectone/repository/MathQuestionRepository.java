package com.projectone.repository;

import com.projectone.model.MathQuestion;
import com.projectone.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class MathQuestionRepository {

    public boolean addMathQuestion(MathQuestion m)  {
        try {
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            session.persist(m);
            transaction.commit();
            session.close();
            return true;
        }catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }
    /*starting criteria API*/
    public List<MathQuestion> getAllMathQuestions() {
        try {
            Session session = HibernateUtil.getSession();
            List<MathQuestion> mathQuestionList;
            mathQuestionList = session.createCriteria(MathQuestion.class).list();
            return mathQuestionList;
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public MathQuestion getMathQuestionByID(int id) {
        try {
            Session session = HibernateUtil.getSession();
            MathQuestion m = (MathQuestion) session.createCriteria(MathQuestion.class)
                    .add(Restrictions.eq(("mathQuestion_id"), id))
                    .uniqueResult();
            return m;

        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public MathQuestion getMathQuestion(MathQuestion m){
        try {
            Session session = HibernateUtil.getSession();
            return session.get(MathQuestion.class, m.getMathQuestion_id());
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public boolean updateMathQuestion(MathQuestion m){
        try {
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            session.merge(m);
            transaction.commit();
            return true;
        }catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }
}
