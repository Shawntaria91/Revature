package com.projectone.repository;

import com.projectone.model.ScavengerItem;
import com.projectone.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.List;

public class ScavengerItemRepository {
    public boolean addScavengerItem(ScavengerItem s){
        try {
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            session.persist(s);
            transaction.commit();
            session.close();
            return true;

        }catch(HibernateException | IOException e){
            //e.printStackTrace();
        }
        return false;
    }
    public List<ScavengerItem> getAllScavengerItems(){
        try {
            Session session = HibernateUtil.getSession();
            List<ScavengerItem> scavengerItemList = session.createQuery("FROM ScavengerItem", ScavengerItem.class).list();
            session.close();
            return scavengerItemList;
        }catch(HibernateException | IOException e){
            e.printStackTrace();
        }finally{
        }
        return null;
    }

    public ScavengerItem getScavengerItemById(int id){
        try {
            Session session = HibernateUtil.getSession();
            Query query = session.createQuery("FROM ScavengerItem WHERE scavengerItem_id = :id", ScavengerItem.class);
            query.setParameter("id", id);
            List<ScavengerItem> scavengerItemList = query.list();
            session.close();
            if(scavengerItemList.size()==1){
                return scavengerItemList.get(0);
            }else{
                return null;
            }
        }catch(HibernateException | IOException e){
            e.printStackTrace();
        }finally{
        }
        return null;
    }
}
